/**
 */
package tdt4250case.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250case.ScheduledActivity;
import tdt4250case.Tdt4250casePackage;
import tdt4250case.Timetable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.impl.TimetableImpl#getScheduledActivity <em>Scheduled Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimetableImpl extends MinimalEObjectImpl.Container implements Timetable {
	/**
	 * The cached value of the '{@link #getScheduledActivity() <em>Scheduled Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduledActivity> scheduledActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimetableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tdt4250casePackage.Literals.TIMETABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScheduledActivity> getScheduledActivity() {
		if (scheduledActivity == null) {
			scheduledActivity = new EObjectContainmentEList<ScheduledActivity>(ScheduledActivity.class, this,
					Tdt4250casePackage.TIMETABLE__SCHEDULED_ACTIVITY);
		}
		return scheduledActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tdt4250casePackage.TIMETABLE__SCHEDULED_ACTIVITY:
			return ((InternalEList<?>) getScheduledActivity()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Tdt4250casePackage.TIMETABLE__SCHEDULED_ACTIVITY:
			return getScheduledActivity();
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
		case Tdt4250casePackage.TIMETABLE__SCHEDULED_ACTIVITY:
			getScheduledActivity().clear();
			getScheduledActivity().addAll((Collection<? extends ScheduledActivity>) newValue);
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
		case Tdt4250casePackage.TIMETABLE__SCHEDULED_ACTIVITY:
			getScheduledActivity().clear();
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
		case Tdt4250casePackage.TIMETABLE__SCHEDULED_ACTIVITY:
			return scheduledActivity != null && !scheduledActivity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimetableImpl
