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
// source: google/spanner/v1/result_set.proto

// Protobuf Java Version: 3.25.8
package com.google.spanner.v1;

public interface ResultSetStatsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.ResultSetStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [QueryPlan][google.spanner.v1.QueryPlan] for the query associated with this
   * result.
   * </pre>
   *
   * <code>.google.spanner.v1.QueryPlan query_plan = 1;</code>
   *
   * @return Whether the queryPlan field is set.
   */
  boolean hasQueryPlan();

  /**
   *
   *
   * <pre>
   * [QueryPlan][google.spanner.v1.QueryPlan] for the query associated with this
   * result.
   * </pre>
   *
   * <code>.google.spanner.v1.QueryPlan query_plan = 1;</code>
   *
   * @return The queryPlan.
   */
  com.google.spanner.v1.QueryPlan getQueryPlan();

  /**
   *
   *
   * <pre>
   * [QueryPlan][google.spanner.v1.QueryPlan] for the query associated with this
   * result.
   * </pre>
   *
   * <code>.google.spanner.v1.QueryPlan query_plan = 1;</code>
   */
  com.google.spanner.v1.QueryPlanOrBuilder getQueryPlanOrBuilder();

  /**
   *
   *
   * <pre>
   * Aggregated statistics from the execution of the query. Only present when
   * the query is profiled. For example, a query could return the statistics as
   * follows:
   *
   *     {
   *       "rows_returned": "3",
   *       "elapsed_time": "1.22 secs",
   *       "cpu_time": "1.19 secs"
   *     }
   * </pre>
   *
   * <code>.google.protobuf.Struct query_stats = 2;</code>
   *
   * @return Whether the queryStats field is set.
   */
  boolean hasQueryStats();

  /**
   *
   *
   * <pre>
   * Aggregated statistics from the execution of the query. Only present when
   * the query is profiled. For example, a query could return the statistics as
   * follows:
   *
   *     {
   *       "rows_returned": "3",
   *       "elapsed_time": "1.22 secs",
   *       "cpu_time": "1.19 secs"
   *     }
   * </pre>
   *
   * <code>.google.protobuf.Struct query_stats = 2;</code>
   *
   * @return The queryStats.
   */
  com.google.protobuf.Struct getQueryStats();

  /**
   *
   *
   * <pre>
   * Aggregated statistics from the execution of the query. Only present when
   * the query is profiled. For example, a query could return the statistics as
   * follows:
   *
   *     {
   *       "rows_returned": "3",
   *       "elapsed_time": "1.22 secs",
   *       "cpu_time": "1.19 secs"
   *     }
   * </pre>
   *
   * <code>.google.protobuf.Struct query_stats = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getQueryStatsOrBuilder();

  /**
   *
   *
   * <pre>
   * Standard DML returns an exact count of rows that were modified.
   * </pre>
   *
   * <code>int64 row_count_exact = 3;</code>
   *
   * @return Whether the rowCountExact field is set.
   */
  boolean hasRowCountExact();

  /**
   *
   *
   * <pre>
   * Standard DML returns an exact count of rows that were modified.
   * </pre>
   *
   * <code>int64 row_count_exact = 3;</code>
   *
   * @return The rowCountExact.
   */
  long getRowCountExact();

  /**
   *
   *
   * <pre>
   * Partitioned DML doesn't offer exactly-once semantics, so it
   * returns a lower bound of the rows modified.
   * </pre>
   *
   * <code>int64 row_count_lower_bound = 4;</code>
   *
   * @return Whether the rowCountLowerBound field is set.
   */
  boolean hasRowCountLowerBound();

  /**
   *
   *
   * <pre>
   * Partitioned DML doesn't offer exactly-once semantics, so it
   * returns a lower bound of the rows modified.
   * </pre>
   *
   * <code>int64 row_count_lower_bound = 4;</code>
   *
   * @return The rowCountLowerBound.
   */
  long getRowCountLowerBound();

  com.google.spanner.v1.ResultSetStats.RowCountCase getRowCountCase();
}
