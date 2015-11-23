package gui.controller;

import gui.view.GUIFrame;

/**
 * AppController for the Simple GUI Application
 * @author Cody Henrichsen
 * @version 0.x Nov 9, 2015
 *
 */
public class GUIAppController
{
	/**
	 * Reference to the GUIFrame object for internal use.
	 */
	private GUIFrame baseFrame;
	
	/**
	 * Creates a GUIAppController and initializes the GUIFrame.
	 */
	public GUIAppController()
	{
		baseFrame =  new GUIFrame(this);
	}
		
	public void start()
	{}
}
