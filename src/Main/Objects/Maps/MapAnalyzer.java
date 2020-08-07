package Main.Objects.Maps;

import Main.Objects.Object;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 8/7/2020
//interprets a txt file and identifies the current map
public class MapAnalyzer {

    public String[] mapDetails;
    public File map;
    public FileReader read;
    public String list;


    public MapAnalyzer(File map) throws IOException {

        this.map = map;
        this.map.setReadable(true);
        this.read = new FileReader(this.map);
        this.list = this.read.toString();
        this.mapDetails = this.list.split(",");
        this.read.close();

    }

    public String WorldName(){

        return this.mapDetails[0];

    }

    public String PlaceName(){

        return this.mapDetails[1];

    }






}
