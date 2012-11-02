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
 * The {@code JobSummaryArgs} class contains arguments for getting a job summary
 * using the {@link Job#getSummary} method.
 */
public class JobSummaryArgs extends Args {

    /**
     * Class constructor.
     */
    public JobSummaryArgs() { super(); }
    
    /* BEGIN AUTOGENERATED CODE */
    
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
     * Sets a list of fields to return for the event set. 
     * 
     * @param fieldList
     *      A list of fields.
     */
    public void setFieldList(String[] fieldList) {
        this.put("f", fieldList);
    }
    
    /**
     * Indicates whether to add histogram data to the summary output. 
     * 
     * @param histogram
     *      {@code true} to add histogram data, {@code false} if not.
     */
    public void setHistogram(boolean histogram) {
        this.put("histogram", histogram);
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
     * Set the fraction of results for each key that this key must occur in to be displayed.
     * 
     * @param minimumFrequency
     *      The frequency, as a fraction (a value between 0 and 1).
     */
    public void setMinimumFrequency(double minimumFrequency) {
        this.put("min_freq", minimumFrequency);
    }
    
    /**
     * Sets a UTC time format. This value defaults to {@code setTimeFormat}.
     * 
     * @param outputTimeFormat
     *      A UTC time format.
     */
    public void setOutputTimeFormat(String outputTimeFormat) {
        this.put("output_time_format", outputTimeFormat);
    }
    
    /**
     * Specifies a substring that all returned events should contain in one of their values or tags.
     * 
     * @param search
     *      A search substring.
     */
    public void setSearch(String search) {
        this.put("search", search);
    }
    
    /**
     * Specifies an expression to convert a formatted time string from {start,end}_time into UTC seconds. The default format is "%m/%d/%Y:%H:%M:%S". 
     * 
     * @param timeFormat
     *      The time format.
     */
    public void setTimeFormat(String timeFormat) {
        this.put("time_format", timeFormat);
    }
    
    /**
     * Sets for each key how many of the most frequent items to return.
     * 
     * @param topCount
     *      The number of items to return.
     */
    public void setTopCount(int topCount) {
        this.put("top_count", topCount);
    }
    
    /* END AUTOGENERATED CODE */
}
