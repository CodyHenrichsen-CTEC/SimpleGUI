/**
 * 
 */
package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIAppController;

/**
 * @author CodyH
 * @version 0.2 Nov 9, 2015 updated the setupFrame to load the contentPane with a GUIPanel.
 *
 */
public class GUIFrame extends JFrame
{
	private GUIAppController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIAppController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}
	
	/**
	 * Required helper method to prepare the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel); //Must be first line of setupFrame! - Installs the panel in the frame.
		this.setSize(400,400);			//Find a good size for the app.
		this.setTitle("silly app!!");
		this.setResizable(false);		//Advisable not required.
		this.setVisible(true);   		//Must be last line of setupFrame!
	}
	
	public GUIAppController getBaseController()
	{
		return baseController;
	}
}
