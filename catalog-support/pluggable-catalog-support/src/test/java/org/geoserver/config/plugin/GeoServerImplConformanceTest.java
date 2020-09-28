/*
 * (c) 2020 Open Source Geospatial Foundation - all rights reserved This code is licensed under the
 * GPL 2.0 license, available at the root application directory.
 */
package org.geoserver.config.plugin;

import org.geoserver.catalog.plugin.CatalogImpl;
import org.geoserver.config.GeoServer;
import org.geoserver.config.GeoServerConfigConformanceTest;

/**
 * {@link GeoServerConfigConformanceTest} for {@link GeoServerImpl} with {@link
 * DefaultGeoServerFacade} backed by {@link DefaultConfigRepository} and a {@link CatalogImpl}
 */
public class GeoServerImplConformanceTest extends GeoServerConfigConformanceTest {

    protected @Override GeoServer createGeoServer() {
        GeoServerImpl gs = new GeoServerImpl();
        gs.setCatalog(new CatalogImpl());
        return gs;
    }
}