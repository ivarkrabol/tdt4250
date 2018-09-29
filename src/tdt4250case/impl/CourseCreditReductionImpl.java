/**
 */
package tdt4250case.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250case.Course;
import tdt4250case.CourseCreditReduction;
import tdt4250case.Tdt4250casePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Credit Reduction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.impl.CourseCreditReductionImpl#getReduction <em>Reduction</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseCreditReductionImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseCreditReductionImpl extends MinimalEObjectImpl.Container implements CourseCreditReduction {
	/**
	 * The default value of the '{@link #getReduction() <em>Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReduction()
	 * @generated
	 * @ordered
	 */
	protected static final float REDUCTION_EDEFAULT = 7.5F;

	/**
	 * The cached value of the '{@link #getReduction() <em>Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReduction()
	 * @generated
	 * @ordered
	 */
	protected float reduction = REDUCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseCreditReductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tdt4250casePackage.Literals.COURSE_CREDIT_REDUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReduction() {
		return reduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReduction(float newReduction) {
		float oldReduction = reduction;
		reduction = newReduction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.COURSE_CREDIT_REDUCTION__REDUCTION,
					oldReduction, reduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getCourse() {
		if (course != null && course.eIsProxy()) {
			InternalEObject oldCourse = (InternalEObject) course;
			course = (Course) eResolveProxy(oldCourse);
			if (course != oldCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Tdt4250casePackage.COURSE_CREDIT_REDUCTION__COURSE, oldCourse, course));
			}
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourse(Course newCourse) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.COURSE_CREDIT_REDUCTION__COURSE,
					oldCourse, course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Tdt4250casePackage.COURSE_CREDIT_REDUCTION__REDUCTION:
			return getReduction();
		case Tdt4250casePackage.COURSE_CREDIT_REDUCTION__COURSE:
			if (resolve)
				return getCourse();
			return basicGetCourse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Tdt4250casePackage.COURSE_CREDIT_REDUCTION__REDUCTION:
			setReduction((Float) newValue);
			return;
		case Tdt4250casePackage.COURSE_CREDIT_REDUCTION__COURSE:
			setCourse((Course) newValue);
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
		case Tdt4250casePackage.COURSE_CREDIT_REDUCTION__REDUCTION:
			setReduction(REDUCTION_EDEFAULT);
			return;
		case Tdt4250casePackage.COURSE_CREDIT_REDUCTION__COURSE:
			setCourse((Course) null);
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
		case Tdt4250casePackage.COURSE_CREDIT_REDUCTION__REDUCTION:
			return reduction != REDUCTION_EDEFAULT;
		case Tdt4250casePackage.COURSE_CREDIT_REDUCTION__COURSE:
			return course != null;
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
		result.append(" (reduction: ");
		result.append(reduction);
		result.append(')');
		return result.toString();
	}

} //CourseCreditReductionImpl
