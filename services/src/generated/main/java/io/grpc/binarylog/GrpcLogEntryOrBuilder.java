// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/grpc/binarylog.proto

package io.grpc.binarylog;

public interface GrpcLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.binarylog.v1alpha.GrpcLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * One of the above Type enum
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.GrpcLogEntry.Type type = 1;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * One of the above Type enum
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.GrpcLogEntry.Type type = 1;</code>
   */
  io.grpc.binarylog.GrpcLogEntry.Type getType();

  /**
   * <pre>
   * One of the above Logger enum
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.GrpcLogEntry.Logger logger = 2;</code>
   */
  int getLoggerValue();
  /**
   * <pre>
   * One of the above Logger enum
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.GrpcLogEntry.Logger logger = 2;</code>
   */
  io.grpc.binarylog.GrpcLogEntry.Logger getLogger();

  /**
   * <pre>
   * Uniquely identifies a call. Each call may have several log entries, they
   * will share the same call_id. 128 bits split into 2 64-bit parts.
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Uint128 call_id = 3;</code>
   */
  boolean hasCallId();
  /**
   * <pre>
   * Uniquely identifies a call. Each call may have several log entries, they
   * will share the same call_id. 128 bits split into 2 64-bit parts.
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Uint128 call_id = 3;</code>
   */
  io.grpc.binarylog.Uint128 getCallId();
  /**
   * <pre>
   * Uniquely identifies a call. Each call may have several log entries, they
   * will share the same call_id. 128 bits split into 2 64-bit parts.
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Uint128 call_id = 3;</code>
   */
  io.grpc.binarylog.Uint128OrBuilder getCallIdOrBuilder();

  /**
   * <pre>
   * Used by CLIENT_INIT_METADATA, SERVER_INIT_METADATA and TRAILING_METADATA
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Metadata metadata = 4;</code>
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Used by CLIENT_INIT_METADATA, SERVER_INIT_METADATA and TRAILING_METADATA
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Metadata metadata = 4;</code>
   */
  io.grpc.binarylog.Metadata getMetadata();
  /**
   * <pre>
   * Used by CLIENT_INIT_METADATA, SERVER_INIT_METADATA and TRAILING_METADATA
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Metadata metadata = 4;</code>
   */
  io.grpc.binarylog.MetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Used by REQUEST and RESPONSE
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Message message = 5;</code>
   */
  boolean hasMessage();
  /**
   * <pre>
   * Used by REQUEST and RESPONSE
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Message message = 5;</code>
   */
  io.grpc.binarylog.Message getMessage();
  /**
   * <pre>
   * Used by REQUEST and RESPONSE
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Message message = 5;</code>
   */
  io.grpc.binarylog.MessageOrBuilder getMessageOrBuilder();

  /**
   * <pre>
   * Peer address information, will only be recorded in SEND_INITIAL_METADATA
   * and RECV_INITIAL_METADATA entries.
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Peer peer = 6;</code>
   */
  boolean hasPeer();
  /**
   * <pre>
   * Peer address information, will only be recorded in SEND_INITIAL_METADATA
   * and RECV_INITIAL_METADATA entries.
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Peer peer = 6;</code>
   */
  io.grpc.binarylog.Peer getPeer();
  /**
   * <pre>
   * Peer address information, will only be recorded in SEND_INITIAL_METADATA
   * and RECV_INITIAL_METADATA entries.
   * </pre>
   *
   * <code>.grpc.binarylog.v1alpha.Peer peer = 6;</code>
   */
  io.grpc.binarylog.PeerOrBuilder getPeerOrBuilder();

  /**
   * <pre>
   * true if payload does not represent the full message or metadata.
   * </pre>
   *
   * <code>bool truncated = 7;</code>
   */
  boolean getTruncated();

  public io.grpc.binarylog.GrpcLogEntry.PayloadCase getPayloadCase();
}
