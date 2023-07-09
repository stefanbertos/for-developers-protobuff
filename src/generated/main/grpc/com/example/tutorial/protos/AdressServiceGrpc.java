package com.example.tutorial.protos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: addressbook.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdressServiceGrpc {

  private AdressServiceGrpc() {}

  public static final String SERVICE_NAME = "tutorial.AdressService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.example.tutorial.protos.AddressBook> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "list",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.example.tutorial.protos.AddressBook.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.example.tutorial.protos.AddressBook> getListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.example.tutorial.protos.AddressBook> getListMethod;
    if ((getListMethod = AdressServiceGrpc.getListMethod) == null) {
      synchronized (AdressServiceGrpc.class) {
        if ((getListMethod = AdressServiceGrpc.getListMethod) == null) {
          AdressServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.example.tutorial.protos.AddressBook>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "list"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.tutorial.protos.AddressBook.getDefaultInstance()))
              .setSchemaDescriptor(new AdressServiceMethodDescriptorSupplier("list"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdressServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdressServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdressServiceStub>() {
        @java.lang.Override
        public AdressServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdressServiceStub(channel, callOptions);
        }
      };
    return AdressServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdressServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdressServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdressServiceBlockingStub>() {
        @java.lang.Override
        public AdressServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdressServiceBlockingStub(channel, callOptions);
        }
      };
    return AdressServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdressServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdressServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdressServiceFutureStub>() {
        @java.lang.Override
        public AdressServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdressServiceFutureStub(channel, callOptions);
        }
      };
    return AdressServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AdressServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.example.tutorial.protos.AddressBook> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.example.tutorial.protos.AddressBook>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class AdressServiceStub extends io.grpc.stub.AbstractAsyncStub<AdressServiceStub> {
    private AdressServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdressServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdressServiceStub(channel, callOptions);
    }

    /**
     */
    public void list(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.example.tutorial.protos.AddressBook> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AdressServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdressServiceBlockingStub> {
    private AdressServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdressServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdressServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.tutorial.protos.AddressBook list(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AdressServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AdressServiceFutureStub> {
    private AdressServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdressServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdressServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.tutorial.protos.AddressBook> list(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdressServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdressServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.tutorial.protos.AddressBook>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AdressServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdressServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.tutorial.protos.AddressBookProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdressService");
    }
  }

  private static final class AdressServiceFileDescriptorSupplier
      extends AdressServiceBaseDescriptorSupplier {
    AdressServiceFileDescriptorSupplier() {}
  }

  private static final class AdressServiceMethodDescriptorSupplier
      extends AdressServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdressServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AdressServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdressServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
