/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolTables;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolTable;

class SqlPoolTablesImpl extends WrapperImpl<SqlPoolTablesInner> implements SqlPoolTables {
    private final SynapseManager manager;

    SqlPoolTablesImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolTables());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    private SqlPoolTableImpl wrapModel(SqlPoolTableInner inner) {
        return  new SqlPoolTableImpl(inner, manager());
    }

    @Override
    public Observable<SqlPoolTable> listBySchemaAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName) {
        SqlPoolTablesInner client = this.inner();
        return client.listBySchemaAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName)
        .flatMapIterable(new Func1<Page<SqlPoolTableInner>, Iterable<SqlPoolTableInner>>() {
            @Override
            public Iterable<SqlPoolTableInner> call(Page<SqlPoolTableInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SqlPoolTableInner, SqlPoolTable>() {
            @Override
            public SqlPoolTable call(SqlPoolTableInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<SqlPoolTable> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName, String tableName) {
        SqlPoolTablesInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName)
        .flatMap(new Func1<SqlPoolTableInner, Observable<SqlPoolTable>>() {
            @Override
            public Observable<SqlPoolTable> call(SqlPoolTableInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SqlPoolTable)wrapModel(inner));
                }
            }
       });
    }

}
