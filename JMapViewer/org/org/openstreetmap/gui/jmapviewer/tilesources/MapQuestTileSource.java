package org.openstreetmap.gui.jmapviewer.tilesources;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;


public class MapQuestTileSource extends AbstractOsmTileSource{
	public MapQuestTileSource(){
		super("mapquest","http://otile1.mqcdn.com/tiles/1.0.0/map");
	}
	
    public TileUpdate getTileUpdate() {
        return TileUpdate.IfNoneMatch;
    }
    public String getTileType() {
        return "jpg";
    }
    
    public String getExtension() {
        return "jpg";
    }
    @Override
    public int getMaxZoom() {
        return 18;
    }

    public String getAttributionText(int zoom, Coordinate topLeft, Coordinate botRight) {
        return "Tiles Courtesy of MapQuest";
    }

    public String getAttributionLinkURL() {
        return "http://www.mapquest.com/";
    }

    public String getTermsOfUseURL() {
        return "http://developer.mapquest.com/web/products/open/map#terms";
    }
    
    @Override
    public Image getAttributionImage() {
        try {
            return ImageIO.read(JMapViewer.class.getResourceAsStream("images/mq_logo.png"));
        } catch (IOException e) {
            return null;
        }
    }
}
