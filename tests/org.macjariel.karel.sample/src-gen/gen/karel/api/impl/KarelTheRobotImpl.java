package gen.karel.api.impl;

import gen.karel.api.KarelTheRobot;
import org.macjariel.karel.core.api.impl.KarelImpl;

public class KarelTheRobotImpl extends KarelImpl implements KarelTheRobot {

	    /** 
	     * This is the implementation of Karel's command defined by user.
	     *
	     * This is a simple user defined command
	     */
		public void simpleCmd() {	
				this.move();
										
				this.move();
										
		}	
	    /** 
	     * This is the implementation of Karel's command defined by user.
	     *
	     * org.eclipse.emf.ecore.impl.DynamicEObjectImpl@22f1b6e0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@2b1d3e0c (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
	     */
		public void turnLeft() {	
				this.turn();
										
		}	
	    /** 
	     * This is the implementation of Karel's command defined by user.
	     *
	     * org.eclipse.emf.ecore.impl.DynamicEObjectImpl@22f1b6e0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@2b1d3e0c (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
	     */
		public void turnRight() {	
				this.turn();
										
				this.turn();
										
				this.turn();
										
		}	
}	
