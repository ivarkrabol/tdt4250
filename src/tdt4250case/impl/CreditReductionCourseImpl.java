/**
 */
package tdt4250case.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250case.Course;
import tdt4250case.CreditReductionCourse;
import tdt4250case.Tdt4250casePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credit Reduction Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.impl.CreditReductionCourseImpl#getReduction <em>Reduction</em>}</li>
 *   <li>{@link tdt4250case.impl.CreditReductionCourseImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link tdt4250case.impl.CreditReductionCourseImpl#getFrom <em>From</em>}</li>
 *   <li>{@link tdt4250case.impl.CreditReductionCourseImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreditReductionCourseImpl extends MinimalEObjectImpl.Container implements CreditReductionCourse {
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
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Date from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Date to = TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditReductionCourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tdt4250casePackage.Literals.CREDIT_REDUCTION_COURSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.CREDIT_REDUCTION_COURSE__REDUCTION,
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
							Tdt4250casePackage.CREDIT_REDUCTION_COURSE__COURSE, oldCourse, course));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.CREDIT_REDUCTION_COURSE__COURSE,
					oldCourse, course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Date newFrom) {
		Date oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.CREDIT_REDUCTION_COURSE__FROM,
					oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Date newTo) {
		Date oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.CREDIT_REDUCTION_COURSE__TO, oldTo,
					to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__REDUCTION:
			return getReduction();
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__COURSE:
			if (resolve)
				return getCourse();
			return basicGetCourse();
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__FROM:
			return getFrom();
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__TO:
			return getTo();
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
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__REDUCTION:
			setReduction((Float) newValue);
			return;
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__COURSE:
			setCourse((Course) newValue);
			return;
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__FROM:
			setFrom((Date) newValue);
			return;
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__TO:
			setTo((Date) newValue);
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
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__REDUCTION:
			setReduction(REDUCTION_EDEFAULT);
			return;
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__COURSE:
			setCourse((Course) null);
			return;
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__FROM:
			setFrom(FROM_EDEFAULT);
			return;
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__TO:
			setTo(TO_EDEFAULT);
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
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__REDUCTION:
			return reduction != REDUCTION_EDEFAULT;
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__COURSE:
			return course != null;
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__FROM:
			return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
		case Tdt4250casePackage.CREDIT_REDUCTION_COURSE__TO:
			return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
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
		result.append(", from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //CreditReductionCourseImpl
