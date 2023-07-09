from __future__ import print_function

import logging
import sys
import grpc
import order_pb2
import order_pb2_grpc


def run():
    # NOTE(gRPC Python Team): .close() is possible on a channel and should be
    # used in circumstances in which the with statement does not fit the needs
    # of the code.
    print("Will try to call create order ...")
    with grpc.insecure_channel('localhost:9090') as channel:
        stub = order_pb2_grpc.CreateOrderServiceStub(channel)

        product1 = order_pb2.Product(id=1, name="auto", description="skoda", price=333)
        product2 = order_pb2.Product(id=2, name="motorka", description="suzuki", price=666)

        response = stub.create(order_pb2.CreateOrderRequest(userId='Stefan',products=[product1, product2]))
    print("response id: "  +str(response.id)+ " status: " + str(response.status))

if __name__ == '__main__':
    logging.basicConfig()
    run()
