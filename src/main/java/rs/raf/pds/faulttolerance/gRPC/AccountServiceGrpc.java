package rs.raf.pds.faulttolerance.gRPC;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: account_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccountServiceGrpc {

  private AccountServiceGrpc() {}

  public static final String SERVICE_NAME = "AccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.faulttolerance.gRPC.AccountRequest,
      rs.raf.pds.faulttolerance.gRPC.AccountResponse> getAddAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAmount",
      requestType = rs.raf.pds.faulttolerance.gRPC.AccountRequest.class,
      responseType = rs.raf.pds.faulttolerance.gRPC.AccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.faulttolerance.gRPC.AccountRequest,
      rs.raf.pds.faulttolerance.gRPC.AccountResponse> getAddAmountMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.faulttolerance.gRPC.AccountRequest, rs.raf.pds.faulttolerance.gRPC.AccountResponse> getAddAmountMethod;
    if ((getAddAmountMethod = AccountServiceGrpc.getAddAmountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getAddAmountMethod = AccountServiceGrpc.getAddAmountMethod) == null) {
          AccountServiceGrpc.getAddAmountMethod = getAddAmountMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.faulttolerance.gRPC.AccountRequest, rs.raf.pds.faulttolerance.gRPC.AccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.faulttolerance.gRPC.AccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.faulttolerance.gRPC.AccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("AddAmount"))
              .build();
        }
      }
    }
    return getAddAmountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.faulttolerance.gRPC.AccountRequest,
      rs.raf.pds.faulttolerance.gRPC.AccountResponse> getWitdrawAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WitdrawAmount",
      requestType = rs.raf.pds.faulttolerance.gRPC.AccountRequest.class,
      responseType = rs.raf.pds.faulttolerance.gRPC.AccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.faulttolerance.gRPC.AccountRequest,
      rs.raf.pds.faulttolerance.gRPC.AccountResponse> getWitdrawAmountMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.faulttolerance.gRPC.AccountRequest, rs.raf.pds.faulttolerance.gRPC.AccountResponse> getWitdrawAmountMethod;
    if ((getWitdrawAmountMethod = AccountServiceGrpc.getWitdrawAmountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getWitdrawAmountMethod = AccountServiceGrpc.getWitdrawAmountMethod) == null) {
          AccountServiceGrpc.getWitdrawAmountMethod = getWitdrawAmountMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.faulttolerance.gRPC.AccountRequest, rs.raf.pds.faulttolerance.gRPC.AccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WitdrawAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.faulttolerance.gRPC.AccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.faulttolerance.gRPC.AccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("WitdrawAmount"))
              .build();
        }
      }
    }
    return getWitdrawAmountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.faulttolerance.gRPC.AccountRequest,
      rs.raf.pds.faulttolerance.gRPC.AccountResponse> getGetAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAmount",
      requestType = rs.raf.pds.faulttolerance.gRPC.AccountRequest.class,
      responseType = rs.raf.pds.faulttolerance.gRPC.AccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.faulttolerance.gRPC.AccountRequest,
      rs.raf.pds.faulttolerance.gRPC.AccountResponse> getGetAmountMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.faulttolerance.gRPC.AccountRequest, rs.raf.pds.faulttolerance.gRPC.AccountResponse> getGetAmountMethod;
    if ((getGetAmountMethod = AccountServiceGrpc.getGetAmountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetAmountMethod = AccountServiceGrpc.getGetAmountMethod) == null) {
          AccountServiceGrpc.getGetAmountMethod = getGetAmountMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.faulttolerance.gRPC.AccountRequest, rs.raf.pds.faulttolerance.gRPC.AccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.faulttolerance.gRPC.AccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.faulttolerance.gRPC.AccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetAmount"))
              .build();
        }
      }
    }
    return getGetAmountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.faulttolerance.gRPC.LogEntry,
      rs.raf.pds.faulttolerance.gRPC.LogResponse> getAppendLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AppendLog",
      requestType = rs.raf.pds.faulttolerance.gRPC.LogEntry.class,
      responseType = rs.raf.pds.faulttolerance.gRPC.LogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.faulttolerance.gRPC.LogEntry,
      rs.raf.pds.faulttolerance.gRPC.LogResponse> getAppendLogMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.faulttolerance.gRPC.LogEntry, rs.raf.pds.faulttolerance.gRPC.LogResponse> getAppendLogMethod;
    if ((getAppendLogMethod = AccountServiceGrpc.getAppendLogMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getAppendLogMethod = AccountServiceGrpc.getAppendLogMethod) == null) {
          AccountServiceGrpc.getAppendLogMethod = getAppendLogMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.faulttolerance.gRPC.LogEntry, rs.raf.pds.faulttolerance.gRPC.LogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AppendLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.faulttolerance.gRPC.LogEntry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.faulttolerance.gRPC.LogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("AppendLog"))
              .build();
        }
      }
    }
    return getAppendLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.faulttolerance.gRPC.LeaderRequest,
      rs.raf.pds.faulttolerance.gRPC.LeaderInfo> getGetLeaderInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLeaderInfo",
      requestType = rs.raf.pds.faulttolerance.gRPC.LeaderRequest.class,
      responseType = rs.raf.pds.faulttolerance.gRPC.LeaderInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.faulttolerance.gRPC.LeaderRequest,
      rs.raf.pds.faulttolerance.gRPC.LeaderInfo> getGetLeaderInfoMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.faulttolerance.gRPC.LeaderRequest, rs.raf.pds.faulttolerance.gRPC.LeaderInfo> getGetLeaderInfoMethod;
    if ((getGetLeaderInfoMethod = AccountServiceGrpc.getGetLeaderInfoMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetLeaderInfoMethod = AccountServiceGrpc.getGetLeaderInfoMethod) == null) {
          AccountServiceGrpc.getGetLeaderInfoMethod = getGetLeaderInfoMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.faulttolerance.gRPC.LeaderRequest, rs.raf.pds.faulttolerance.gRPC.LeaderInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLeaderInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.faulttolerance.gRPC.LeaderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.faulttolerance.gRPC.LeaderInfo.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetLeaderInfo"))
              .build();
        }
      }
    }
    return getGetLeaderInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub>() {
        @java.lang.Override
        public AccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceStub(channel, callOptions);
        }
      };
    return AccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub>() {
        @java.lang.Override
        public AccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub>() {
        @java.lang.Override
        public AccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceFutureStub(channel, callOptions);
        }
      };
    return AccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addAmount(rs.raf.pds.faulttolerance.gRPC.AccountRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.faulttolerance.gRPC.AccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAmountMethod(), responseObserver);
    }

    /**
     */
    default void witdrawAmount(rs.raf.pds.faulttolerance.gRPC.AccountRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.faulttolerance.gRPC.AccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWitdrawAmountMethod(), responseObserver);
    }

    /**
     */
    default void getAmount(rs.raf.pds.faulttolerance.gRPC.AccountRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.faulttolerance.gRPC.AccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAmountMethod(), responseObserver);
    }

    /**
     */
    default void appendLog(rs.raf.pds.faulttolerance.gRPC.LogEntry request,
        io.grpc.stub.StreamObserver<rs.raf.pds.faulttolerance.gRPC.LogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendLogMethod(), responseObserver);
    }

    /**
     */
    default void getLeaderInfo(rs.raf.pds.faulttolerance.gRPC.LeaderRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.faulttolerance.gRPC.LeaderInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLeaderInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AccountService.
   */
  public static abstract class AccountServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AccountServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AccountService.
   */
  public static final class AccountServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AccountServiceStub> {
    private AccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceStub(channel, callOptions);
    }

    /**
     */
    public void addAmount(rs.raf.pds.faulttolerance.gRPC.AccountRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.faulttolerance.gRPC.AccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAmountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void witdrawAmount(rs.raf.pds.faulttolerance.gRPC.AccountRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.faulttolerance.gRPC.AccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWitdrawAmountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAmount(rs.raf.pds.faulttolerance.gRPC.AccountRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.faulttolerance.gRPC.AccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAmountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void appendLog(rs.raf.pds.faulttolerance.gRPC.LogEntry request,
        io.grpc.stub.StreamObserver<rs.raf.pds.faulttolerance.gRPC.LogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLeaderInfo(rs.raf.pds.faulttolerance.gRPC.LeaderRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.faulttolerance.gRPC.LeaderInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLeaderInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AccountService.
   */
  public static final class AccountServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AccountServiceBlockingStub> {
    private AccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public rs.raf.pds.faulttolerance.gRPC.AccountResponse addAmount(rs.raf.pds.faulttolerance.gRPC.AccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAmountMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.faulttolerance.gRPC.AccountResponse witdrawAmount(rs.raf.pds.faulttolerance.gRPC.AccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWitdrawAmountMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.faulttolerance.gRPC.AccountResponse getAmount(rs.raf.pds.faulttolerance.gRPC.AccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAmountMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.faulttolerance.gRPC.LogResponse appendLog(rs.raf.pds.faulttolerance.gRPC.LogEntry request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendLogMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.faulttolerance.gRPC.LeaderInfo getLeaderInfo(rs.raf.pds.faulttolerance.gRPC.LeaderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLeaderInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AccountService.
   */
  public static final class AccountServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AccountServiceFutureStub> {
    private AccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.faulttolerance.gRPC.AccountResponse> addAmount(
        rs.raf.pds.faulttolerance.gRPC.AccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAmountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.faulttolerance.gRPC.AccountResponse> witdrawAmount(
        rs.raf.pds.faulttolerance.gRPC.AccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWitdrawAmountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.faulttolerance.gRPC.AccountResponse> getAmount(
        rs.raf.pds.faulttolerance.gRPC.AccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAmountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.faulttolerance.gRPC.LogResponse> appendLog(
        rs.raf.pds.faulttolerance.gRPC.LogEntry request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendLogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.faulttolerance.gRPC.LeaderInfo> getLeaderInfo(
        rs.raf.pds.faulttolerance.gRPC.LeaderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLeaderInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_AMOUNT = 0;
  private static final int METHODID_WITDRAW_AMOUNT = 1;
  private static final int METHODID_GET_AMOUNT = 2;
  private static final int METHODID_APPEND_LOG = 3;
  private static final int METHODID_GET_LEADER_INFO = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_AMOUNT:
          serviceImpl.addAmount((rs.raf.pds.faulttolerance.gRPC.AccountRequest) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.faulttolerance.gRPC.AccountResponse>) responseObserver);
          break;
        case METHODID_WITDRAW_AMOUNT:
          serviceImpl.witdrawAmount((rs.raf.pds.faulttolerance.gRPC.AccountRequest) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.faulttolerance.gRPC.AccountResponse>) responseObserver);
          break;
        case METHODID_GET_AMOUNT:
          serviceImpl.getAmount((rs.raf.pds.faulttolerance.gRPC.AccountRequest) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.faulttolerance.gRPC.AccountResponse>) responseObserver);
          break;
        case METHODID_APPEND_LOG:
          serviceImpl.appendLog((rs.raf.pds.faulttolerance.gRPC.LogEntry) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.faulttolerance.gRPC.LogResponse>) responseObserver);
          break;
        case METHODID_GET_LEADER_INFO:
          serviceImpl.getLeaderInfo((rs.raf.pds.faulttolerance.gRPC.LeaderRequest) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.faulttolerance.gRPC.LeaderInfo>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddAmountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.faulttolerance.gRPC.AccountRequest,
              rs.raf.pds.faulttolerance.gRPC.AccountResponse>(
                service, METHODID_ADD_AMOUNT)))
        .addMethod(
          getWitdrawAmountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.faulttolerance.gRPC.AccountRequest,
              rs.raf.pds.faulttolerance.gRPC.AccountResponse>(
                service, METHODID_WITDRAW_AMOUNT)))
        .addMethod(
          getGetAmountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.faulttolerance.gRPC.AccountRequest,
              rs.raf.pds.faulttolerance.gRPC.AccountResponse>(
                service, METHODID_GET_AMOUNT)))
        .addMethod(
          getAppendLogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.faulttolerance.gRPC.LogEntry,
              rs.raf.pds.faulttolerance.gRPC.LogResponse>(
                service, METHODID_APPEND_LOG)))
        .addMethod(
          getGetLeaderInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.faulttolerance.gRPC.LeaderRequest,
              rs.raf.pds.faulttolerance.gRPC.LeaderInfo>(
                service, METHODID_GET_LEADER_INFO)))
        .build();
  }

  private static abstract class AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return rs.raf.pds.faulttolerance.gRPC.AccountServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountService");
    }
  }

  private static final class AccountServiceFileDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier {
    AccountServiceFileDescriptorSupplier() {}
  }

  private static final class AccountServiceMethodDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountServiceFileDescriptorSupplier())
              .addMethod(getAddAmountMethod())
              .addMethod(getWitdrawAmountMethod())
              .addMethod(getGetAmountMethod())
              .addMethod(getAppendLogMethod())
              .addMethod(getGetLeaderInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
