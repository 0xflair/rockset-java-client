/*
 * REST API
 * Rockset's REST API allows for creating and managing all resources in Rockset. Each supported endpoint is documented below.  All requests must be authorized with a Rockset API key, which can be created in the [Rockset console](https://console.rockset.com). The API key must be provided as `ApiKey <api_key>` in the `Authorization` request header. For example: ``` Authorization: ApiKey aB35kDjg93J5nsf4GjwMeErAVd832F7ad4vhsW1S02kfZiab42sTsfW5Sxt25asT ```  All endpoints are only accessible via https.  Build something awesome!
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.rockset.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BulkStats
 */
// @javax.annotation.Generated(value =
// "io.swagger.codegen.languages.JavaClientCodegen", date =
// "2023-09-19T15:55:29.974-07:00")
public class BulkStats {
  @SerializedName("data_downloaded_bytes")
  private Long dataDownloadedBytes = null;

  @SerializedName("data_indexed_bytes")
  private Long dataIndexedBytes = null;

  @SerializedName("data_indexed_throughput_bytes")
  private Double dataIndexedThroughputBytes = null;

  @SerializedName("documents_downloaded")
  private Long documentsDownloaded = null;

  @SerializedName("download_compute_ms")
  private Long downloadComputeMs = null;

  @SerializedName("downloading_stage_done_at")
  private String downloadingStageDoneAt = null;

  @SerializedName("finalizing_stage_done_at")
  private String finalizingStageDoneAt = null;

  @SerializedName("index_compute_ms")
  private Long indexComputeMs = null;

  @SerializedName("indexing_stage_done_at")
  private String indexingStageDoneAt = null;

  @SerializedName("initializing_stage_done_at")
  private String initializingStageDoneAt = null;

  @SerializedName("pre_index_size_bytes")
  private Long preIndexSizeBytes = null;

  @SerializedName("provisioning_stage_done_at")
  private String provisioningStageDoneAt = null;

  @SerializedName("started_at")
  private String startedAt = null;

  @SerializedName("total_index_size_bytes")
  private Long totalIndexSizeBytes = null;

  @SerializedName("transformation_compute_ms")
  private Long transformationComputeMs = null;

  public BulkStats dataDownloadedBytes(Long dataDownloadedBytes) {
    this.dataDownloadedBytes = dataDownloadedBytes;
    return this;
  }

  /**
   * Size in bytes of documents downloaded from source during an ongoing or
   * completed bulk ingest. This includes documents that are dropped and
   * reingested.
   * 
   * @return dataDownloadedBytes
   **/

  @JsonProperty("data_downloaded_bytes")
  @ApiModelProperty(example = "10000000", value = "Size in bytes of documents downloaded from source during an ongoing or completed bulk ingest. This includes documents that are dropped and reingested.")
  public Long getDataDownloadedBytes() {
    return dataDownloadedBytes;
  }

  public void setDataDownloadedBytes(Long dataDownloadedBytes) {
    this.dataDownloadedBytes = dataDownloadedBytes;
  }

  public BulkStats dataIndexedBytes(Long dataIndexedBytes) {
    this.dataIndexedBytes = dataIndexedBytes;
    return this;
  }

  /**
   * Size in bytes of documents indexed. This is the total size of documents after
   * transformations and dropping before indexes are built.
   * 
   * @return dataIndexedBytes
   **/

  @JsonProperty("data_indexed_bytes")
  @ApiModelProperty(example = "8000000", value = "Size in bytes of documents indexed. This is the total size of documents after transformations and dropping before indexes are built.")
  public Long getDataIndexedBytes() {
    return dataIndexedBytes;
  }

  public void setDataIndexedBytes(Long dataIndexedBytes) {
    this.dataIndexedBytes = dataIndexedBytes;
  }

  public BulkStats dataIndexedThroughputBytes(Double dataIndexedThroughputBytes) {
    this.dataIndexedThroughputBytes = dataIndexedThroughputBytes;
    return this;
  }

  /**
   * Throughput of documents indexed in the last minute measured in bytes/s. This
   * is based off the data_indexed_bytes size. Throughput during the download
   * stage is shown on a per-source granularity in the sources field of the
   * Collection response.
   * 
   * @return dataIndexedThroughputBytes
   **/

  @JsonProperty("data_indexed_throughput_bytes")
  @ApiModelProperty(example = "800000.5", value = "Throughput of documents indexed in the last minute measured in bytes/s. This is based off the data_indexed_bytes size. Throughput during the download stage is shown on a per-source granularity in the sources field of the Collection response.")
  public Double getDataIndexedThroughputBytes() {
    return dataIndexedThroughputBytes;
  }

  public void setDataIndexedThroughputBytes(Double dataIndexedThroughputBytes) {
    this.dataIndexedThroughputBytes = dataIndexedThroughputBytes;
  }

  public BulkStats documentsDownloaded(Long documentsDownloaded) {
    this.documentsDownloaded = documentsDownloaded;
    return this;
  }

  /**
   * Number of documents downloaded from source during an ongoing or completed
   * bulk ingest. This includes documents that are dropped and reingested.
   * 
   * @return documentsDownloaded
   **/

  @JsonProperty("documents_downloaded")
  @ApiModelProperty(example = "10000", value = "Number of documents downloaded from source during an ongoing or completed bulk ingest. This includes documents that are dropped and reingested.")
  public Long getDocumentsDownloaded() {
    return documentsDownloaded;
  }

  public void setDocumentsDownloaded(Long documentsDownloaded) {
    this.documentsDownloaded = documentsDownloaded;
  }

  public BulkStats downloadComputeMs(Long downloadComputeMs) {
    this.downloadComputeMs = downloadComputeMs;
    return this;
  }

  /**
   * Bulk ingest compute units in milliseconds used for downloading documents.
   * 
   * @return downloadComputeMs
   **/

  @JsonProperty("download_compute_ms")
  @ApiModelProperty(example = "50000", value = "Bulk ingest compute units in milliseconds used for downloading documents.")
  public Long getDownloadComputeMs() {
    return downloadComputeMs;
  }

  public void setDownloadComputeMs(Long downloadComputeMs) {
    this.downloadComputeMs = downloadComputeMs;
  }

  public BulkStats downloadingStageDoneAt(String downloadingStageDoneAt) {
    this.downloadingStageDoneAt = downloadingStageDoneAt;
    return this;
  }

  /**
   * ISO-8601 date of when the downloading stage was completed.
   * 
   * @return downloadingStageDoneAt
   **/

  @JsonProperty("downloading_stage_done_at")
  @ApiModelProperty(example = "2001-08-28T00:23:41Z", value = "ISO-8601 date of when the downloading stage was completed.")
  public String getDownloadingStageDoneAt() {
    return downloadingStageDoneAt;
  }

  public void setDownloadingStageDoneAt(String downloadingStageDoneAt) {
    this.downloadingStageDoneAt = downloadingStageDoneAt;
  }

  public BulkStats finalizingStageDoneAt(String finalizingStageDoneAt) {
    this.finalizingStageDoneAt = finalizingStageDoneAt;
    return this;
  }

  /**
   * ISO-8601 date of when the finalizing stage was completed.
   * 
   * @return finalizingStageDoneAt
   **/

  @JsonProperty("finalizing_stage_done_at")
  @ApiModelProperty(example = "2001-08-28T00:23:41Z", value = "ISO-8601 date of when the finalizing stage was completed.")
  public String getFinalizingStageDoneAt() {
    return finalizingStageDoneAt;
  }

  public void setFinalizingStageDoneAt(String finalizingStageDoneAt) {
    this.finalizingStageDoneAt = finalizingStageDoneAt;
  }

  public BulkStats indexComputeMs(Long indexComputeMs) {
    this.indexComputeMs = indexComputeMs;
    return this;
  }

  /**
   * Bulk ingest compute units in milliseconds used for indexing documents.
   * 
   * @return indexComputeMs
   **/

  @JsonProperty("index_compute_ms")
  @ApiModelProperty(example = "100000", value = "Bulk ingest compute units in milliseconds used for indexing documents.")
  public Long getIndexComputeMs() {
    return indexComputeMs;
  }

  public void setIndexComputeMs(Long indexComputeMs) {
    this.indexComputeMs = indexComputeMs;
  }

  public BulkStats indexingStageDoneAt(String indexingStageDoneAt) {
    this.indexingStageDoneAt = indexingStageDoneAt;
    return this;
  }

  /**
   * ISO-8601 date of when the indexing stage was completed.
   * 
   * @return indexingStageDoneAt
   **/

  @JsonProperty("indexing_stage_done_at")
  @ApiModelProperty(example = "2001-08-28T00:23:41Z", value = "ISO-8601 date of when the indexing stage was completed.")
  public String getIndexingStageDoneAt() {
    return indexingStageDoneAt;
  }

  public void setIndexingStageDoneAt(String indexingStageDoneAt) {
    this.indexingStageDoneAt = indexingStageDoneAt;
  }

  public BulkStats initializingStageDoneAt(String initializingStageDoneAt) {
    this.initializingStageDoneAt = initializingStageDoneAt;
    return this;
  }

  /**
   * ISO-8601 date of when the initializing stage was completed.
   * 
   * @return initializingStageDoneAt
   **/

  @JsonProperty("initializing_stage_done_at")
  @ApiModelProperty(example = "2001-08-28T00:23:41Z", value = "ISO-8601 date of when the initializing stage was completed.")
  public String getInitializingStageDoneAt() {
    return initializingStageDoneAt;
  }

  public void setInitializingStageDoneAt(String initializingStageDoneAt) {
    this.initializingStageDoneAt = initializingStageDoneAt;
  }

  public BulkStats preIndexSizeBytes(Long preIndexSizeBytes) {
    this.preIndexSizeBytes = preIndexSizeBytes;
    return this;
  }

  /**
   * Size in bytes of documents before being indexed. This is the total size of
   * documents after decompression, transformations, and dropping. This is equal
   * to data_indexed_bytes after the indexing stage is done unless there are
   * retries during indexing the data.
   * 
   * @return preIndexSizeBytes
   **/

  @JsonProperty("pre_index_size_bytes")
  @ApiModelProperty(example = "8000000", value = "Size in bytes of documents before being indexed. This is the total size of documents after decompression, transformations, and dropping. This is equal to data_indexed_bytes after the indexing stage is done unless there are retries during indexing the data.")
  public Long getPreIndexSizeBytes() {
    return preIndexSizeBytes;
  }

  public void setPreIndexSizeBytes(Long preIndexSizeBytes) {
    this.preIndexSizeBytes = preIndexSizeBytes;
  }

  public BulkStats provisioningStageDoneAt(String provisioningStageDoneAt) {
    this.provisioningStageDoneAt = provisioningStageDoneAt;
    return this;
  }

  /**
   * ISO-8601 date of when the provisioning stage was completed.
   * 
   * @return provisioningStageDoneAt
   **/

  @JsonProperty("provisioning_stage_done_at")
  @ApiModelProperty(example = "2001-08-28T00:23:41Z", value = "ISO-8601 date of when the provisioning stage was completed.")
  public String getProvisioningStageDoneAt() {
    return provisioningStageDoneAt;
  }

  public void setProvisioningStageDoneAt(String provisioningStageDoneAt) {
    this.provisioningStageDoneAt = provisioningStageDoneAt;
  }

  public BulkStats startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * ISO-8601 date of when the bulk ingest was started.
   * 
   * @return startedAt
   **/

  @JsonProperty("started_at")
  @ApiModelProperty(example = "2001-08-28T00:23:41Z", value = "ISO-8601 date of when the bulk ingest was started.")
  public String getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }

  public BulkStats totalIndexSizeBytes(Long totalIndexSizeBytes) {
    this.totalIndexSizeBytes = totalIndexSizeBytes;
    return this;
  }

  /**
   * Total size of indexes after the completed bulk ingest. This is the same as
   * collection size.
   * 
   * @return totalIndexSizeBytes
   **/

  @JsonProperty("total_index_size_bytes")
  @ApiModelProperty(example = "10000000", value = "Total size of indexes after the completed bulk ingest. This is the same as collection size.")
  public Long getTotalIndexSizeBytes() {
    return totalIndexSizeBytes;
  }

  public void setTotalIndexSizeBytes(Long totalIndexSizeBytes) {
    this.totalIndexSizeBytes = totalIndexSizeBytes;
  }

  public BulkStats transformationComputeMs(Long transformationComputeMs) {
    this.transformationComputeMs = transformationComputeMs;
    return this;
  }

  /**
   * Bulk ingest compute units in milliseconds used for ingest transformation.
   * 
   * @return transformationComputeMs
   **/

  @JsonProperty("transformation_compute_ms")
  @ApiModelProperty(example = "50000", value = "Bulk ingest compute units in milliseconds used for ingest transformation.")
  public Long getTransformationComputeMs() {
    return transformationComputeMs;
  }

  public void setTransformationComputeMs(Long transformationComputeMs) {
    this.transformationComputeMs = transformationComputeMs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkStats bulkStats = (BulkStats) o;
    return Objects.equals(this.dataDownloadedBytes, bulkStats.dataDownloadedBytes) &&
        Objects.equals(this.dataIndexedBytes, bulkStats.dataIndexedBytes) &&
        Objects.equals(this.dataIndexedThroughputBytes, bulkStats.dataIndexedThroughputBytes) &&
        Objects.equals(this.documentsDownloaded, bulkStats.documentsDownloaded) &&
        Objects.equals(this.downloadComputeMs, bulkStats.downloadComputeMs) &&
        Objects.equals(this.downloadingStageDoneAt, bulkStats.downloadingStageDoneAt) &&
        Objects.equals(this.finalizingStageDoneAt, bulkStats.finalizingStageDoneAt) &&
        Objects.equals(this.indexComputeMs, bulkStats.indexComputeMs) &&
        Objects.equals(this.indexingStageDoneAt, bulkStats.indexingStageDoneAt) &&
        Objects.equals(this.initializingStageDoneAt, bulkStats.initializingStageDoneAt) &&
        Objects.equals(this.preIndexSizeBytes, bulkStats.preIndexSizeBytes) &&
        Objects.equals(this.provisioningStageDoneAt, bulkStats.provisioningStageDoneAt) &&
        Objects.equals(this.startedAt, bulkStats.startedAt) &&
        Objects.equals(this.totalIndexSizeBytes, bulkStats.totalIndexSizeBytes) &&
        Objects.equals(this.transformationComputeMs, bulkStats.transformationComputeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataDownloadedBytes, dataIndexedBytes, dataIndexedThroughputBytes, documentsDownloaded,
        downloadComputeMs, downloadingStageDoneAt, finalizingStageDoneAt, indexComputeMs, indexingStageDoneAt,
        initializingStageDoneAt, preIndexSizeBytes, provisioningStageDoneAt, startedAt, totalIndexSizeBytes,
        transformationComputeMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkStats {\n");

    sb.append("    dataDownloadedBytes: ").append(toIndentedString(dataDownloadedBytes)).append("\n");
    sb.append("    dataIndexedBytes: ").append(toIndentedString(dataIndexedBytes)).append("\n");
    sb.append("    dataIndexedThroughputBytes: ").append(toIndentedString(dataIndexedThroughputBytes)).append("\n");
    sb.append("    documentsDownloaded: ").append(toIndentedString(documentsDownloaded)).append("\n");
    sb.append("    downloadComputeMs: ").append(toIndentedString(downloadComputeMs)).append("\n");
    sb.append("    downloadingStageDoneAt: ").append(toIndentedString(downloadingStageDoneAt)).append("\n");
    sb.append("    finalizingStageDoneAt: ").append(toIndentedString(finalizingStageDoneAt)).append("\n");
    sb.append("    indexComputeMs: ").append(toIndentedString(indexComputeMs)).append("\n");
    sb.append("    indexingStageDoneAt: ").append(toIndentedString(indexingStageDoneAt)).append("\n");
    sb.append("    initializingStageDoneAt: ").append(toIndentedString(initializingStageDoneAt)).append("\n");
    sb.append("    preIndexSizeBytes: ").append(toIndentedString(preIndexSizeBytes)).append("\n");
    sb.append("    provisioningStageDoneAt: ").append(toIndentedString(provisioningStageDoneAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    totalIndexSizeBytes: ").append(toIndentedString(totalIndexSizeBytes)).append("\n");
    sb.append("    transformationComputeMs: ").append(toIndentedString(transformationComputeMs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
