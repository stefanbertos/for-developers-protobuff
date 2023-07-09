package com.example.demo.service;


import com.example.demo.entity.Product;
import com.example.demo.entity.ProductOrder;
import com.example.demo.protos.CreateOrderRequest;
import com.example.demo.protos.CreateOrderResponse;
import com.example.demo.protos.CreateOrderServiceGrpc;
import com.example.demo.protos.Status;
import com.example.demo.repository.OrderRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CreateOrderServiceImpl extends CreateOrderServiceGrpc.CreateOrderServiceImplBase {
    private OrderRepository orderRepository;
    public CreateOrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void create(CreateOrderRequest request, StreamObserver<CreateOrderResponse> responseObserver) {


        var order = new ProductOrder();
        order.setUserId(request.getUserId());
        for (com.example.demo.protos.Product requestProduct : request.getProductsList()) {
            var product = new Product();
            product.setName(requestProduct.getName());
            product.setDescription(requestProduct.getDescription());
            product.setPrice(requestProduct.getPrice());
            order.addProduct(product);
        }
        order = orderRepository.save(order);
        var response = CreateOrderResponse.newBuilder()
                .setId(order.getId()).setStatus(Status.CREATED)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
