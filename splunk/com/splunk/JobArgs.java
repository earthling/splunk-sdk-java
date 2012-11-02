/*
 * Copyright 2012 Splunk, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"): you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.splunk;

/**
 * The {@code JobArgs} class contains arguments for creating a {@link Job}.
 */
public class JobArgs extends Args {
    
    /**
     * Specifies how to create a job using the {@link JobCollection#create} 
     * method.
     */
    public static enum ExecutionMode {
        /** Runs a search asynchronously and returns a search job immediately.*/
        NORMAL("normal"),
        /** Runs a search synchronously and does not return a search job until 
        * the search has finished. */
        BLOCKING("blocking"),
        /** Runs a blocking search that is scheduled to run immediately, then 
        * returns the results of the search once completed. */
        ONESHOT("oneshot");
        
        private String value;
        
        private ExecutionMode(String value) {
            this.value = value;
        }
        
        /**
         * @return The REST API value for this enumerated constant.
         */
        public String toString() {
            return this.value;
        }
    }
    
    /**
     * Specifies how to create a job using the {@link JobCollection#create} 
     * method.
     */
    public static enum SearchMode {
        /**
         * Searches historical data.
         */
        NORMAL("normal"),
        /**
         * Searches live data. A real-time search may also be specified by 
         * setting the "earliest_time" and "latest_time" parameters to begin 
         * with "rt", even if the search_mode is set to "normal" or is not set. 
         * <p>
         * If both the "earliest_time" and "latest_time" parameters are set to 
         * "rt", the search represents all appropriate live data that was 
         * received since the start of the search.
         * <p>
         * If both the "earliest_time" and "latest_time" parameters are set to 
         * "rt" followed by a relative time specifier, a sliding window is used 
         * where the time bounds of the window are determined by the relative 
         * time specifiers and are continuously updated based on current time.
         */
        REALTIME("realtime");
        
        private String value;
        
        private SearchMode(String value) {
            this.value = value;
        }
        
        /**
         * @return The REST API value for this enumerated constant.
         */
        public String toString() {
            return this.value;
        }
    }

    /**
     * Class constructor.
     */
    public JobArgs() { super(); }
    
    /* BEGIN AUTOGENERATED CODE */
    
    /**
     * Sets the number of seconds of inactivity after which to automatically cancel a job. A value of 0 means never auto-cancel.
     * 
     * @param autoCancel
     *      The number of seconds after which to cancel a job.
     */
    public void setAutoCancel(int autoCancel) {
        this.put("auto_cancel", autoCancel);
    }
    
    /**
     * Sets the number of events to process after which to auto-finalize the search. A value of 0 means no limit.
     * 
     * @param autoFinalizeEventCount
     *      The number of events.
     */
    public void setAutoFinalizeEventCount(int autoFinalizeEventCount) {
        this.put("auto_finalize_ec", autoFinalizeEventCount);
    }
    
    /**
     * Sets the number of seconds of inactivity after which to automatically pause a job. A value of 0 means never auto-pause.
     * 
     * @param autoPause
     *      The number of seconds after which to pause.
     */
    public void setAutoPause(int autoPause) {
        this.put("auto_pause", autoPause);
    }
    
    /**
     * Specifies the earliest time in the time range to search. The time string can be a UTC time (with fractional seconds), a relative time specifier (to now), or a formatted time string.
     * 
     * @param earliestTime
     *      The earliest time. 
     */
    public void setEarliestTime(String earliestTime) {
        this.put("earliest_time", earliestTime);
    }
    
    /**
     * Indicates whether to enable lookups for this search. Enabling lookups might slow searches significantly depending on the nature of the lookups.
     * 
     * @param enableLookups
     *      {@code true} to enable lookups, {@code false} if not.
     */
    public void setEnableLookups(boolean enableLookups) {
        this.put("enable_lookups", enableLookups);
    }
    
    /**
     * Sets the type of search to run ("blocking", "oneshot", or "normal").
     * 
     * @param executionMode
     *      The search type.
     */
    public void setExecutionMode(ExecutionMode executionMode) {
        this.put("exec_mode", executionMode);
    }
    
    /**
     * Specifies whether this search should cause (and wait depending on the value of {@code setSynchronizeBundleReplication}) bundle synchronization with all search peers.
     * 
     * @param forceBundleReplication
     *      {@code true} if this search should cause bundle synchronization,
     *      {@code false} if not.
     */
    public void setForceBundleReplication(boolean forceBundleReplication) {
        this.put("force_bundle_replication", forceBundleReplication);
    }
    
    /**
     * Sets a search ID (SID). If unspecified, a random ID is generated. 
     * 
     * @param id
     *      The search ID.
     */
    public void setId(String id) {
        this.put("id", id);
    }
    
    /**
     * Specifies the latest time in the time range to search. The time string can be a UTC time (with fractional seconds), a relative time specifier (to now), or a formatted time string.
     * 
     * @param latestTime
     *      The latest time. 
     */
    public void setLatestTime(String latestTime) {
        this.put("latest_time", latestTime);
    }
    
    /**
     * Sets the number of events that can be accessible in any given status bucket. Also, in transforming mode, this sets the maximum number of results to store. Specifically, in all calls, {@code codeoffset + count <= max_count}.
     * 
     * @param maximumCount
     *      The maximum count of events.
     */
    public void setMaximumCount(int maximumCount) {
        this.put("max_count", maximumCount);
    }
    
    /**
     * Sets the maximum number of seconds to run this search before finalizing. Specify 0 to never finalize.
     * 
     * @param maximumTime
     *      The maximum time, in seconds.
     */
    public void setMaximumTime(int maximumTime) {
        this.put("max_time", maximumTime);
    }
    
    /**
     * Specifies the application namespace to which to restrict searches. 
     * 
     * @param namespace
     *      The namespace.
     */
    public void setNamespace(String namespace) {
        this.put("namespace", namespace);
    }
    
    /**
     * Specifies a time string that sets the absolute time used for any relative time specifier in the search. This value defaults to the current system time.<p>You can specify a relative time modifier for this parameter. For example, specify +2d to specify the current time plus two days. If you specify a relative time modifier both in this parameter and in the search string, the search string modifier takes precedence.<p>For information about relative time modifiers, see <a href="http://docs.splunk.com/Documentation/Splunk/latest/SearchReference/SearchTimeModifiers" target="_blank">Time modifiers for search</a> in the Search Reference. 
     * 
     * @param now
     *      The time string.
     */
    public void setNow(String now) {
        this.put("now", now);
    }
    
    /**
     * Sets the number of seconds (frequency) to run the MapReduce reduce phase on accumulated map values.
     * 
     * @param reduceFrequency
     *      The reduce frequency, in seconds. 
     */
    public void setReduceFrequency(int reduceFrequency) {
        this.put("reduce_freq", reduceFrequency);
    }
    
    /**
     * Indicates whether to reload macro definitions from the macros.conf configuration file.
     * 
     * @param reloadMacros
     *      {@code true} to reload macro definitions, {@code false} if not.
     */
    public void setReloadMacros(boolean reloadMacros) {
        this.put("reload_macros", reloadMacros);
    }
    
    /**
     * Sets a list of (possibly wildcarded) servers from which to pull raw events. This same server list is used in subsearches.
     * 
     * @param remoteServerList
     *      The list of servers.
     */
    public void setRemoteServerList(String[] remoteServerList) {
        StringBuilder csv = new StringBuilder();
            for (int i = 0, n = remoteServerList.length; i < n; i++) {
                if (i != 0) {
                    csv.append(",");
                }
                csv.append(remoteServerList[i]);
            }
            
            this.put("remote_server_list", String.valueOf(csv));
    }
    
    /**
     * Sets one or more required fields to the search. These fields, even if not referenced or used directly by the search, are still included by the events and summary endpoints. Splunk Web uses these fields to prepopulate panels in the Search view.
     * 
     * @param requiredFieldList
     *      The list of fields.
     */
    public void setRequiredFieldList(String[] requiredFieldList) {
        this.put("rf", requiredFieldList);
    }
    
    /**
     * Indicates whether the indexer blocks if the queue for this search is full. For real-time searches.
     * 
     * @param realtimeBlocking
     *      {@code true} to block the indexer for a full queue, {@code false} if not.
     */
    public void setRealtimeBlocking(boolean realtimeBlocking) {
        this.put("rt_blocking", realtimeBlocking);
    }
    
    /**
     * Indicates whether the indexer pre-filters events. For real-time searches.
     * 
     * @param realtimeIndexFilter
     *      {@code true} to pre-filter events, {@code false} if not.
     */
    public void setRealtimeIndexFilter(boolean realtimeIndexFilter) {
        this.put("rt_indexfilter", realtimeIndexFilter);
    }
    
    /**
     * Sets the number of seconds indicating the maximum time to block. A value of 0 means no limit. For real-time searches with "rt_blocking" set to {@code true}.
     * 
     * @param realtimeMaximumBlockSeconds
     *      The maximum time to block, in seconds.
     */
    public void setRealtimeMaximumBlockSeconds(int realtimeMaximumBlockSeconds) {
        this.put("rt_maxblocksecs", realtimeMaximumBlockSeconds);
    }
    
    /**
     * Sets the number indicating the queue size (in events) that the indexer should use for this search. For real-time searches.
     * 
     * @param realtimeQueueSize
     *      The queue size, in events.
     */
    public void setRealtimeQueueSize(int realtimeQueueSize) {
        this.put("rt_queue_size", realtimeQueueSize);
    }
    
    /**
     * Sets a string that registers a search state listener with the search. Use the format: {@code search_state;results_condition;http_method;uri;}<p>For example:<p>{@code search_listener=onResults;true;POST;/servicesNS/admin/search/saved/search/foobar/notify;}
     * 
     * @param searchListener
     *      The search listener string.
     */
    public void setSearchListener(String searchListener) {
        this.put("search_listener", searchListener);
    }
    
    /**
     * Sets the search mode ("normal" or "realtime").
     * 
     * @param searchMode
     *      The search mode.
     */
    public void setSearchMode(SearchMode searchMode) {
        this.put("search_mode", searchMode);
    }
    
    /**
     * Indicates whether the search should run in a separate spawned process. Searches against indexes must run in a separate process.
     * 
     * @param spawnProcess
     *      {@code true} to run the search in a separate process, {@code false} if not.
     */
    public void setSpawnProcess(boolean spawnProcess) {
        this.put("spawn_process", spawnProcess);
    }
    
    /**
     * Sets the maximum number of status buckets to generate. A value of 0 means to not generate timeline information.
     * 
     * @param statusBuckets
     *      The maximum number of buckets.
     */
    public void setStatusBuckets(int statusBuckets) {
        this.put("status_buckets", statusBuckets);
    }
    
    /**
     * Indicates whether this search should wait for bundle replication to complete.
     * 
     * @param synchronizeBundleReplication
     *      {@code true} to wait for bundle replication, {@code false} if not.
     */
    public void setSynchronizeBundleReplication(boolean synchronizeBundleReplication) {
        this.put("sync_bundle_replication", synchronizeBundleReplication);
    }
    
    /**
     * Sets the format for converting a formatted time string from {start,end}_time into UTC seconds. The default value is ISO-8601.
     * 
     * @param timeFormat
     *      The time format string.
     */
    public void setTimeFormat(String timeFormat) {
        this.put("time_format", timeFormat);
    }
    
    /**
     * Sets the number of seconds to keep this search after processing has stopped.
     * 
     * @param timeout
     *      The timeout, in seconds.
     */
    public void setTimeout(int timeout) {
        this.put("timeout", timeout);
    }
    
    /* END AUTOGENERATED CODE */
}
