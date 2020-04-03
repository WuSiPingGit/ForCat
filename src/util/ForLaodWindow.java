package util;
import bean.SLC;
import view.LaodWindows;

public class ForLaodWindow {
    private ForLaodWindow() {}
    public static <T> void forLaodJpanel(int whichJpanel,int i, int j, int k, T component) {
    	if (whichJpanel>0&&whichJpanel<5) 
    		 SetJPanel.setJPanelLauout(SLC.laodJpanel, false, i, j, k, LaodWindows.getGridBagLayout(whichJpanel), component); 
    }
}
