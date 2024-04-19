package testDataset;

import com.cohort.util.File2;

import gov.noaa.pfel.coastwatch.sgt.SgtMap;
import gov.noaa.pfel.erddap.dataset.EDD;

public class Initialization {
  public static void edStatic() {
    File2.setWebInfParentDirectory();
    System.setProperty("doSetupValidation", String.valueOf(false));
    System.setProperty("erddapContentDirectory", System.getProperty("user.dir") + "/development/jetty/config/");
    EDD.debugMode = true;
    System.setProperty("useSansSerifFont", String.valueOf(true));
    SgtMap.fontFamily = "SansSerif";
  }
}
