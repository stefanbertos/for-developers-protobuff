package com.example.demo.service;


import com.example.demo.entity.Product;
import com.example.demo.entity.ProductOrder;
import com.example.demo.repository.OrderRepository;
import com.example.tutorial.protos.CreateOrderRequest;
import com.example.tutorial.protos.CreateOrderResponse;
import com.example.tutorial.protos.CreateOrderServiceGrpc;
import com.example.tutorial.protos.Status;
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
        var response = CreateOrderResponse.newBuilder()
                .setId(1).setStatus(Status.CREATED)
                .build();

        var order = new ProductOrder();
        order.setUserId(request.getUserId());
        for (com.example.tutorial.protos.Product requestProduct : request.getProductsList()) {
            var product = new Product();
            product.setName(requestProduct.getName());
            product.setDescription(requestProduct.getDescription());
            product.setPrice(requestProduct.getPrice());
            order.addProduct(product);
        }
        orderRepository.save(order);

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
