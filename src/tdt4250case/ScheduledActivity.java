/**
 */
package tdt4250case;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tdt4250case.util.Timeslot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.ScheduledActivity#getTimeslot <em>Timeslot</em>}</li>
 *   <li>{@link tdt4250case.ScheduledActivity#getActivity <em>Activity</em>}</li>
 *   <li>{@link tdt4250case.ScheduledActivity#getRoom <em>Room</em>}</li>
 *   <li>{@link tdt4250case.ScheduledActivity#getReservedFor <em>Reserved For</em>}</li>
 * </ul>
 *
 * @see tdt4250case.Tdt4250casePackage#getScheduledActivity()
 * @model
 * @generated
 */
public interface ScheduledActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Timeslot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeslot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeslot</em>' attribute.
	 * @see #setTimeslot(Timeslot)
	 * @see tdt4250case.Tdt4250casePackage#getScheduledActivity_Timeslot()
	 * @model dataType="tdt4250case.Timeslot" required="true"
	 * @generated
	 */
	Timeslot getTimeslot();

	/**
	 * Sets the value of the '{@link tdt4250case.ScheduledActivity#getTimeslot <em>Timeslot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeslot</em>' attribute.
	 * @see #getTimeslot()
	 * @generated
	 */
	void setTimeslot(Timeslot value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' attribute.
	 * @see #setActivity(String)
	 * @see tdt4250case.Tdt4250casePackage#getScheduledActivity_Activity()
	 * @model required="true"
	 * @generated
	 */
	String getActivity();

	/**
	 * Sets the value of the '{@link tdt4250case.ScheduledActivity#getActivity <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' attribute.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(String value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' attribute.
	 * @see #setRoom(String)
	 * @see tdt4250case.Tdt4250casePackage#getScheduledActivity_Room()
	 * @model required="true"
	 * @generated
	 */
	String getRoom();

	/**
	 * Sets the value of the '{@link tdt4250case.ScheduledActivity#getRoom <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' attribute.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(String value);

	/**
	 * Returns the value of the '<em><b>Reserved For</b></em>' reference list.
	 * The list contents are of type {@link tdt4250case.Studyprogram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved For</em>' reference list.
	 * @see tdt4250case.Tdt4250casePackage#getScheduledActivity_ReservedFor()
	 * @model required="true"
	 * @generated
	 */
	EList<Studyprogram> getReservedFor();

} // ScheduledActivity
