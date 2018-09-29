/**
 */
package tdt4250case.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tdt4250case.ScheduledActivity;
import tdt4250case.Studyprogram;
import tdt4250case.Tdt4250casePackage;

import tdt4250case.util.Timeslot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduled Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.impl.ScheduledActivityImpl#getTimeslot <em>Timeslot</em>}</li>
 *   <li>{@link tdt4250case.impl.ScheduledActivityImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link tdt4250case.impl.ScheduledActivityImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link tdt4250case.impl.ScheduledActivityImpl#getReservedFor <em>Reserved For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduledActivityImpl extends MinimalEObjectImpl.Container implements ScheduledActivity {
	/**
	 * The default value of the '{@link #getTimeslot() <em>Timeslot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeslot()
	 * @generated
	 * @ordered
	 */
	protected static final Timeslot TIMESLOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeslot() <em>Timeslot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeslot()
	 * @generated
	 * @ordered
	 */
	protected Timeslot timeslot = TIMESLOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivity() <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected String activity = ACTIVITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoom() <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected String room = ROOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReservedFor() <em>Reserved For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedFor()
	 * @generated
	 * @ordered
	 */
	protected EList<Studyprogram> reservedFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduledActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tdt4250casePackage.Literals.SCHEDULED_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timeslot getTimeslot() {
		return timeslot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeslot(Timeslot newTimeslot) {
		Timeslot oldTimeslot = timeslot;
		timeslot = newTimeslot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.SCHEDULED_ACTIVITY__TIMESLOT,
					oldTimeslot, timeslot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(String newActivity) {
		String oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.SCHEDULED_ACTIVITY__ACTIVITY,
					oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(String newRoom) {
		String oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.SCHEDULED_ACTIVITY__ROOM, oldRoom,
					room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Studyprogram> getReservedFor() {
		if (reservedFor == null) {
			reservedFor = new EObjectResolvingEList<Studyprogram>(Studyprogram.class, this,
					Tdt4250casePackage.SCHEDULED_ACTIVITY__RESERVED_FOR);
		}
		return reservedFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__TIMESLOT:
			return getTimeslot();
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__ACTIVITY:
			return getActivity();
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__ROOM:
			return getRoom();
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__RESERVED_FOR:
			return getReservedFor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__TIMESLOT:
			setTimeslot((Timeslot) newValue);
			return;
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__ACTIVITY:
			setActivity((String) newValue);
			return;
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__ROOM:
			setRoom((String) newValue);
			return;
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__RESERVED_FOR:
			getReservedFor().clear();
			getReservedFor().addAll((Collection<? extends Studyprogram>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__TIMESLOT:
			setTimeslot(TIMESLOT_EDEFAULT);
			return;
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__ACTIVITY:
			setActivity(ACTIVITY_EDEFAULT);
			return;
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__ROOM:
			setRoom(ROOM_EDEFAULT);
			return;
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__RESERVED_FOR:
			getReservedFor().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__TIMESLOT:
			return TIMESLOT_EDEFAULT == null ? timeslot != null : !TIMESLOT_EDEFAULT.equals(timeslot);
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__ACTIVITY:
			return ACTIVITY_EDEFAULT == null ? activity != null : !ACTIVITY_EDEFAULT.equals(activity);
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__ROOM:
			return ROOM_EDEFAULT == null ? room != null : !ROOM_EDEFAULT.equals(room);
		case Tdt4250casePackage.SCHEDULED_ACTIVITY__RESERVED_FOR:
			return reservedFor != null && !reservedFor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (timeslot: ");
		result.append(timeslot);
		result.append(", activity: ");
		result.append(activity);
		result.append(", room: ");
		result.append(room);
		result.append(')');
		return result.toString();
	}

} //ScheduledActivityImpl
