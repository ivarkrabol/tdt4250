/**
 */
package tdt4250case;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.Timetable#getScheduledActivity <em>Scheduled Activity</em>}</li>
 * </ul>
 *
 * @see tdt4250case.Tdt4250casePackage#getTimetable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noOverlappingTimeslots'"
 * @generated
 */
public interface Timetable extends EObject {
	/**
	 * Returns the value of the '<em><b>Scheduled Activity</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250case.ScheduledActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Activity</em>' containment reference list.
	 * @see tdt4250case.Tdt4250casePackage#getTimetable_ScheduledActivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScheduledActivity> getScheduledActivity();

} // Timetable
