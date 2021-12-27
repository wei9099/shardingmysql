package com.weiyx.shardingmysql.datasource;

import com.alibaba.ttl.TransmittableThreadLocal;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.util.Map;

public class DynamicDataSource extends AbstractRoutingDataSource {

    private static final DynamicDataSource instance = new DynamicDataSource();

    private static final ThreadLocal<String> CONTEXT_HOLDER = new TransmittableThreadLocal<>(){
        @Override
        protected String initialValue() {
            return "default";
        }
    };

    private DynamicDataSource() {};

    public static DynamicDataSource getInstance() {
        return instance;
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return getDataSource();
    }

    private String getDataSource(){
        return CONTEXT_HOLDER.get();
    }

    @Override
    public void setTargetDataSources(Map<Object, Object> targetDataSources) {
        super.setTargetDataSources(targetDataSources);
    }
}
