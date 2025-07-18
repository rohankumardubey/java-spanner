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
// source: google/spanner/admin/database/v1/backup_schedule.proto

// Protobuf Java Version: 3.25.8
package com.google.spanner.admin.database.v1;

public interface CrontabSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.database.v1.CrontabSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Textual representation of the crontab. User can customize the
   * backup frequency and the backup version time using the cron
   * expression. The version time must be in UTC timezone.
   *
   * The backup will contain an externally consistent copy of the
   * database at the version time. Allowed frequencies are 12 hour, 1 day,
   * 1 week and 1 month. Examples of valid cron specifications:
   *   * `0 2/12 * * * ` : every 12 hours at (2, 14) hours past midnight in UTC.
   *   * `0 2,14 * * * ` : every 12 hours at (2,14) hours past midnight in UTC.
   *   * `0 2 * * * `    : once a day at 2 past midnight in UTC.
   *   * `0 2 * * 0 `    : once a week every Sunday at 2 past midnight in UTC.
   *   * `0 2 8 * * `    : once a month on 8th day at 2 past midnight in UTC.
   * </pre>
   *
   * <code>string text = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The text.
   */
  java.lang.String getText();

  /**
   *
   *
   * <pre>
   * Required. Textual representation of the crontab. User can customize the
   * backup frequency and the backup version time using the cron
   * expression. The version time must be in UTC timezone.
   *
   * The backup will contain an externally consistent copy of the
   * database at the version time. Allowed frequencies are 12 hour, 1 day,
   * 1 week and 1 month. Examples of valid cron specifications:
   *   * `0 2/12 * * * ` : every 12 hours at (2, 14) hours past midnight in UTC.
   *   * `0 2,14 * * * ` : every 12 hours at (2,14) hours past midnight in UTC.
   *   * `0 2 * * * `    : once a day at 2 past midnight in UTC.
   *   * `0 2 * * 0 `    : once a week every Sunday at 2 past midnight in UTC.
   *   * `0 2 8 * * `    : once a month on 8th day at 2 past midnight in UTC.
   * </pre>
   *
   * <code>string text = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time zone of the times in `CrontabSpec.text`. Currently
   * only UTC is supported.
   * </pre>
   *
   * <code>string time_zone = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The timeZone.
   */
  java.lang.String getTimeZone();

  /**
   *
   *
   * <pre>
   * Output only. The time zone of the times in `CrontabSpec.text`. Currently
   * only UTC is supported.
   * </pre>
   *
   * <code>string time_zone = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString getTimeZoneBytes();

  /**
   *
   *
   * <pre>
   * Output only. Schedule backups will contain an externally consistent copy
   * of the database at the version time specified in
   * `schedule_spec.cron_spec`. However, Spanner may not initiate the creation
   * of the scheduled backups at that version time. Spanner will initiate
   * the creation of scheduled backups within the time window bounded by the
   * version_time specified in `schedule_spec.cron_spec` and version_time +
   * `creation_window`.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration creation_window = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the creationWindow field is set.
   */
  boolean hasCreationWindow();

  /**
   *
   *
   * <pre>
   * Output only. Schedule backups will contain an externally consistent copy
   * of the database at the version time specified in
   * `schedule_spec.cron_spec`. However, Spanner may not initiate the creation
   * of the scheduled backups at that version time. Spanner will initiate
   * the creation of scheduled backups within the time window bounded by the
   * version_time specified in `schedule_spec.cron_spec` and version_time +
   * `creation_window`.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration creation_window = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The creationWindow.
   */
  com.google.protobuf.Duration getCreationWindow();

  /**
   *
   *
   * <pre>
   * Output only. Schedule backups will contain an externally consistent copy
   * of the database at the version time specified in
   * `schedule_spec.cron_spec`. However, Spanner may not initiate the creation
   * of the scheduled backups at that version time. Spanner will initiate
   * the creation of scheduled backups within the time window bounded by the
   * version_time specified in `schedule_spec.cron_spec` and version_time +
   * `creation_window`.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration creation_window = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getCreationWindowOrBuilder();
}
