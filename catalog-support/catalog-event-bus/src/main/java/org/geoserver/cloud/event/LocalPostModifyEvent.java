/*
 * (c) 2020 Open Source Geospatial Foundation - all rights reserved This code is licensed under the
 * GPL 2.0 license, available at the root application directory.
 */
package org.geoserver.cloud.event;

import java.util.List;
import lombok.NonNull;
import org.geoserver.catalog.Info;
import org.geoserver.catalog.plugin.PropertyDiff;

public abstract class LocalPostModifyEvent<S, I extends Info> extends LocalModifyEvent<S, I> {

    private static final long serialVersionUID = 1L;

    protected LocalPostModifyEvent(
            S source,
            @NonNull I object,
            List<String> propertyNames,
            List<Object> oldValues,
            List<Object> newValues) {
        super(source, object, propertyNames, oldValues, newValues);
    }

    protected LocalPostModifyEvent(S source, @NonNull I object, @NonNull PropertyDiff diff) {
        super(source, object, diff);
    }
}
