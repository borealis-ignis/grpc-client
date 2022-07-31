package org.grpc_server.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: employee_service.proto")
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "org.grpc_server.proto.EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      org.grpc_server.proto.EmployeeProfile> getGetEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmployee",
      requestType = com.google.protobuf.Int64Value.class,
      responseType = org.grpc_server.proto.EmployeeProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      org.grpc_server.proto.EmployeeProfile> getGetEmployeeMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int64Value, org.grpc_server.proto.EmployeeProfile> getGetEmployeeMethod;
    if ((getGetEmployeeMethod = EmployeeServiceGrpc.getGetEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetEmployeeMethod = EmployeeServiceGrpc.getGetEmployeeMethod) == null) {
          EmployeeServiceGrpc.getGetEmployeeMethod = getGetEmployeeMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Int64Value, org.grpc_server.proto.EmployeeProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int64Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc_server.proto.EmployeeProfile.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("GetEmployee"))
              .build();
        }
      }
    }
    return getGetEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc_server.proto.EmployeeProfile,
      org.grpc_server.proto.EmployeeProfile> getAddEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddEmployee",
      requestType = org.grpc_server.proto.EmployeeProfile.class,
      responseType = org.grpc_server.proto.EmployeeProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc_server.proto.EmployeeProfile,
      org.grpc_server.proto.EmployeeProfile> getAddEmployeeMethod() {
    io.grpc.MethodDescriptor<org.grpc_server.proto.EmployeeProfile, org.grpc_server.proto.EmployeeProfile> getAddEmployeeMethod;
    if ((getAddEmployeeMethod = EmployeeServiceGrpc.getAddEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getAddEmployeeMethod = EmployeeServiceGrpc.getAddEmployeeMethod) == null) {
          EmployeeServiceGrpc.getAddEmployeeMethod = getAddEmployeeMethod =
              io.grpc.MethodDescriptor.<org.grpc_server.proto.EmployeeProfile, org.grpc_server.proto.EmployeeProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc_server.proto.EmployeeProfile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc_server.proto.EmployeeProfile.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("AddEmployee"))
              .build();
        }
      }
    }
    return getAddEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.BoolValue> getDeleteEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEmployee",
      requestType = com.google.protobuf.Int64Value.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.BoolValue> getDeleteEmployeeMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int64Value, com.google.protobuf.BoolValue> getDeleteEmployeeMethod;
    if ((getDeleteEmployeeMethod = EmployeeServiceGrpc.getDeleteEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getDeleteEmployeeMethod = EmployeeServiceGrpc.getDeleteEmployeeMethod) == null) {
          EmployeeServiceGrpc.getDeleteEmployeeMethod = getDeleteEmployeeMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Int64Value, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int64Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("DeleteEmployee"))
              .build();
        }
      }
    }
    return getDeleteEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc_server.proto.EmployeeProfile,
      com.google.protobuf.Empty> getClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientStream",
      requestType = org.grpc_server.proto.EmployeeProfile.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.grpc_server.proto.EmployeeProfile,
      com.google.protobuf.Empty> getClientStreamMethod() {
    io.grpc.MethodDescriptor<org.grpc_server.proto.EmployeeProfile, com.google.protobuf.Empty> getClientStreamMethod;
    if ((getClientStreamMethod = EmployeeServiceGrpc.getClientStreamMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getClientStreamMethod = EmployeeServiceGrpc.getClientStreamMethod) == null) {
          EmployeeServiceGrpc.getClientStreamMethod = getClientStreamMethod =
              io.grpc.MethodDescriptor.<org.grpc_server.proto.EmployeeProfile, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc_server.proto.EmployeeProfile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("ClientStream"))
              .build();
        }
      }
    }
    return getClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.grpc_server.proto.EmployeeProfile> getServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerStream",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.grpc_server.proto.EmployeeProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.grpc_server.proto.EmployeeProfile> getServerStreamMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.grpc_server.proto.EmployeeProfile> getServerStreamMethod;
    if ((getServerStreamMethod = EmployeeServiceGrpc.getServerStreamMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getServerStreamMethod = EmployeeServiceGrpc.getServerStreamMethod) == null) {
          EmployeeServiceGrpc.getServerStreamMethod = getServerStreamMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.grpc_server.proto.EmployeeProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc_server.proto.EmployeeProfile.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("ServerStream"))
              .build();
        }
      }
    }
    return getServerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc_server.proto.EmployeeProfile,
      org.grpc_server.proto.EmployeeProfile> getBiDirectionalStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BiDirectionalStream",
      requestType = org.grpc_server.proto.EmployeeProfile.class,
      responseType = org.grpc_server.proto.EmployeeProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.grpc_server.proto.EmployeeProfile,
      org.grpc_server.proto.EmployeeProfile> getBiDirectionalStreamMethod() {
    io.grpc.MethodDescriptor<org.grpc_server.proto.EmployeeProfile, org.grpc_server.proto.EmployeeProfile> getBiDirectionalStreamMethod;
    if ((getBiDirectionalStreamMethod = EmployeeServiceGrpc.getBiDirectionalStreamMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getBiDirectionalStreamMethod = EmployeeServiceGrpc.getBiDirectionalStreamMethod) == null) {
          EmployeeServiceGrpc.getBiDirectionalStreamMethod = getBiDirectionalStreamMethod =
              io.grpc.MethodDescriptor.<org.grpc_server.proto.EmployeeProfile, org.grpc_server.proto.EmployeeProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BiDirectionalStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc_server.proto.EmployeeProfile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc_server.proto.EmployeeProfile.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("BiDirectionalStream"))
              .build();
        }
      }
    }
    return getBiDirectionalStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub>() {
        @java.lang.Override
        public EmployeeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceStub(channel, callOptions);
        }
      };
    return EmployeeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub>() {
        @java.lang.Override
        public EmployeeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceBlockingStub(channel, callOptions);
        }
      };
    return EmployeeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub>() {
        @java.lang.Override
        public EmployeeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceFutureStub(channel, callOptions);
        }
      };
    return EmployeeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EmployeeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEmployee(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeMethod(), responseObserver);
    }

    /**
     */
    public void addEmployee(org.grpc_server.proto.EmployeeProfile request,
        io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddEmployeeMethod(), responseObserver);
    }

    /**
     */
    public void deleteEmployee(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEmployeeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile> clientStream(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getClientStreamMethod(), responseObserver);
    }

    /**
     */
    public void serverStream(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile> biDirectionalStream(
        io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBiDirectionalStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEmployeeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int64Value,
                org.grpc_server.proto.EmployeeProfile>(
                  this, METHODID_GET_EMPLOYEE)))
          .addMethod(
            getAddEmployeeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.grpc_server.proto.EmployeeProfile,
                org.grpc_server.proto.EmployeeProfile>(
                  this, METHODID_ADD_EMPLOYEE)))
          .addMethod(
            getDeleteEmployeeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int64Value,
                com.google.protobuf.BoolValue>(
                  this, METHODID_DELETE_EMPLOYEE)))
          .addMethod(
            getClientStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.grpc_server.proto.EmployeeProfile,
                com.google.protobuf.Empty>(
                  this, METHODID_CLIENT_STREAM)))
          .addMethod(
            getServerStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.grpc_server.proto.EmployeeProfile>(
                  this, METHODID_SERVER_STREAM)))
          .addMethod(
            getBiDirectionalStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.grpc_server.proto.EmployeeProfile,
                org.grpc_server.proto.EmployeeProfile>(
                  this, METHODID_BI_DIRECTIONAL_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeServiceStub extends io.grpc.stub.AbstractAsyncStub<EmployeeServiceStub> {
    private EmployeeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEmployee(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addEmployee(org.grpc_server.proto.EmployeeProfile request,
        io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEmployee(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile> clientStream(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void serverStream(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getServerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile> biDirectionalStream(
        io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBiDirectionalStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.grpc_server.proto.EmployeeProfile getEmployee(com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc_server.proto.EmployeeProfile addEmployee(org.grpc_server.proto.EmployeeProfile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.BoolValue deleteEmployee(com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.grpc_server.proto.EmployeeProfile> serverStream(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getServerStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc_server.proto.EmployeeProfile> getEmployee(
        com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc_server.proto.EmployeeProfile> addEmployee(
        org.grpc_server.proto.EmployeeProfile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> deleteEmployee(
        com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEmployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EMPLOYEE = 0;
  private static final int METHODID_ADD_EMPLOYEE = 1;
  private static final int METHODID_DELETE_EMPLOYEE = 2;
  private static final int METHODID_SERVER_STREAM = 3;
  private static final int METHODID_CLIENT_STREAM = 4;
  private static final int METHODID_BI_DIRECTIONAL_STREAM = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EMPLOYEE:
          serviceImpl.getEmployee((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile>) responseObserver);
          break;
        case METHODID_ADD_EMPLOYEE:
          serviceImpl.addEmployee((org.grpc_server.proto.EmployeeProfile) request,
              (io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile>) responseObserver);
          break;
        case METHODID_DELETE_EMPLOYEE:
          serviceImpl.deleteEmployee((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
          break;
        case METHODID_SERVER_STREAM:
          serviceImpl.serverStream((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile>) responseObserver);
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
        case METHODID_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientStream(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_BI_DIRECTIONAL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biDirectionalStream(
              (io.grpc.stub.StreamObserver<org.grpc_server.proto.EmployeeProfile>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.grpc_server.proto.EmployeeServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
              .addMethod(getGetEmployeeMethod())
              .addMethod(getAddEmployeeMethod())
              .addMethod(getDeleteEmployeeMethod())
              .addMethod(getClientStreamMethod())
              .addMethod(getServerStreamMethod())
              .addMethod(getBiDirectionalStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
