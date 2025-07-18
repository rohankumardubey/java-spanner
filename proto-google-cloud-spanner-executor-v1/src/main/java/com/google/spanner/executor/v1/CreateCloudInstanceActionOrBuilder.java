/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/executor/v1/cloud_executor.proto

// Protobuf Java Version: 3.25.8
package com.google.spanner.executor.v1;

public interface CreateCloudInstanceActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.executor.v1.CreateCloudInstanceAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cloud instance ID (not path), e.g. "test-instance".
   * </pre>
   *
   * <code>string instance_id = 1;</code>
   *
   * @return The instanceId.
   */
  java.lang.String getInstanceId();

  /**
   *
   *
   * <pre>
   * Cloud instance ID (not path), e.g. "test-instance".
   * </pre>
   *
   * <code>string instance_id = 1;</code>
   *
   * @return The bytes for instanceId.
   */
  com.google.protobuf.ByteString getInstanceIdBytes();

  /**
   *
   *
   * <pre>
   * Cloud project ID, e.g. "spanner-cloud-systest".
   * </pre>
   *
   * <code>string project_id = 2;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();

  /**
   *
   *
   * <pre>
   * Cloud project ID, e.g. "spanner-cloud-systest".
   * </pre>
   *
   * <code>string project_id = 2;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Instance config ID, e.g. "test-config".
   * </pre>
   *
   * <code>string instance_config_id = 3;</code>
   *
   * @return The instanceConfigId.
   */
  java.lang.String getInstanceConfigId();

  /**
   *
   *
   * <pre>
   * Instance config ID, e.g. "test-config".
   * </pre>
   *
   * <code>string instance_config_id = 3;</code>
   *
   * @return The bytes for instanceConfigId.
   */
  com.google.protobuf.ByteString getInstanceConfigIdBytes();

  /**
   *
   *
   * <pre>
   * Number of nodes (processing_units should not be set or set to 0 if used).
   * </pre>
   *
   * <code>optional int32 node_count = 4;</code>
   *
   * @return Whether the nodeCount field is set.
   */
  boolean hasNodeCount();

  /**
   *
   *
   * <pre>
   * Number of nodes (processing_units should not be set or set to 0 if used).
   * </pre>
   *
   * <code>optional int32 node_count = 4;</code>
   *
   * @return The nodeCount.
   */
  int getNodeCount();

  /**
   *
   *
   * <pre>
   * Number of processing units (node_count should be set to 0 if used).
   * </pre>
   *
   * <code>optional int32 processing_units = 6;</code>
   *
   * @return Whether the processingUnits field is set.
   */
  boolean hasProcessingUnits();

  /**
   *
   *
   * <pre>
   * Number of processing units (node_count should be set to 0 if used).
   * </pre>
   *
   * <code>optional int32 processing_units = 6;</code>
   *
   * @return The processingUnits.
   */
  int getProcessingUnits();

  /**
   *
   *
   * <pre>
   * The autoscaling config for this instance. If non-empty, an autoscaling
   * instance will be created (processing_units and node_count should be set to
   * 0 if used).
   * </pre>
   *
   * <code>optional .google.spanner.admin.instance.v1.AutoscalingConfig autoscaling_config = 7;
   * </code>
   *
   * @return Whether the autoscalingConfig field is set.
   */
  boolean hasAutoscalingConfig();

  /**
   *
   *
   * <pre>
   * The autoscaling config for this instance. If non-empty, an autoscaling
   * instance will be created (processing_units and node_count should be set to
   * 0 if used).
   * </pre>
   *
   * <code>optional .google.spanner.admin.instance.v1.AutoscalingConfig autoscaling_config = 7;
   * </code>
   *
   * @return The autoscalingConfig.
   */
  com.google.spanner.admin.instance.v1.AutoscalingConfig getAutoscalingConfig();

  /**
   *
   *
   * <pre>
   * The autoscaling config for this instance. If non-empty, an autoscaling
   * instance will be created (processing_units and node_count should be set to
   * 0 if used).
   * </pre>
   *
   * <code>optional .google.spanner.admin.instance.v1.AutoscalingConfig autoscaling_config = 7;
   * </code>
   */
  com.google.spanner.admin.instance.v1.AutoscalingConfigOrBuilder getAutoscalingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
