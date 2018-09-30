/**
 */
package tdt4250case.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250case.Course;
import tdt4250case.CourseInstance;
import tdt4250case.CourseWork;
import tdt4250case.CreditReductionCourse;
import tdt4250case.Studyprogram;
import tdt4250case.Tdt4250casePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.impl.CourseImpl#getStudyprogram <em>Studyprogram</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseImpl#getContent <em>Content</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseImpl#getRequiredCourse <em>Required Course</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseImpl#getRecommendedCourse <em>Recommended Course</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseImpl#getCreditReductionCourse <em>Credit Reduction Course</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseImpl#getCourseWork <em>Course Work</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The cached value of the '{@link #getStudyprogram() <em>Studyprogram</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyprogram()
	 * @generated
	 * @ordered
	 */
	protected EList<Studyprogram> studyprogram;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float CREDITS_EDEFAULT = 7.5F;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected float credits = CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredCourse() <em>Required Course</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> requiredCourse;

	/**
	 * The cached value of the '{@link #getRecommendedCourse() <em>Recommended Course</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> recommendedCourse;

	/**
	 * The cached value of the '{@link #getCreditReductionCourse() <em>Credit Reduction Course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditReductionCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<CreditReductionCourse> creditReductionCourse;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseInstance> instance;

	/**
	 * The cached value of the '{@link #getCourseWork() <em>Course Work</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseWork()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseWork> courseWork;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tdt4250casePackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Studyprogram> getStudyprogram() {
		if (studyprogram == null) {
			studyprogram = new EObjectWithInverseResolvingEList.ManyInverse<Studyprogram>(Studyprogram.class, this,
					Tdt4250casePackage.COURSE__STUDYPROGRAM, Tdt4250casePackage.STUDYPROGRAM__COURSE);
		}
		return studyprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.COURSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.COURSE__CONTENT, oldContent,
					content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(float newCredits) {
		float oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.COURSE__CREDITS, oldCredits,
					credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getRequiredCourse() {
		if (requiredCourse == null) {
			requiredCourse = new EObjectResolvingEList<Course>(Course.class, this,
					Tdt4250casePackage.COURSE__REQUIRED_COURSE);
		}
		return requiredCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getRecommendedCourse() {
		if (recommendedCourse == null) {
			recommendedCourse = new EObjectResolvingEList<Course>(Course.class, this,
					Tdt4250casePackage.COURSE__RECOMMENDED_COURSE);
		}
		return recommendedCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreditReductionCourse> getCreditReductionCourse() {
		if (creditReductionCourse == null) {
			creditReductionCourse = new EObjectContainmentEList<CreditReductionCourse>(CreditReductionCourse.class,
					this, Tdt4250casePackage.COURSE__CREDIT_REDUCTION_COURSE);
		}
		return creditReductionCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseInstance> getInstance() {
		if (instance == null) {
			instance = new EObjectContainmentWithInverseEList<CourseInstance>(CourseInstance.class, this,
					Tdt4250casePackage.COURSE__INSTANCE, Tdt4250casePackage.COURSE_INSTANCE__COURSE);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseWork> getCourseWork() {
		if (courseWork == null) {
			courseWork = new EObjectContainmentEList<CourseWork>(CourseWork.class, this,
					Tdt4250casePackage.COURSE__COURSE_WORK);
		}
		return courseWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tdt4250casePackage.COURSE__STUDYPROGRAM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStudyprogram()).basicAdd(otherEnd, msgs);
		case Tdt4250casePackage.COURSE__INSTANCE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInstance()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tdt4250casePackage.COURSE__STUDYPROGRAM:
			return ((InternalEList<?>) getStudyprogram()).basicRemove(otherEnd, msgs);
		case Tdt4250casePackage.COURSE__CREDIT_REDUCTION_COURSE:
			return ((InternalEList<?>) getCreditReductionCourse()).basicRemove(otherEnd, msgs);
		case Tdt4250casePackage.COURSE__INSTANCE:
			return ((InternalEList<?>) getInstance()).basicRemove(otherEnd, msgs);
		case Tdt4250casePackage.COURSE__COURSE_WORK:
			return ((InternalEList<?>) getCourseWork()).basicRemove(otherEnd, msgs);
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
		case Tdt4250casePackage.COURSE__STUDYPROGRAM:
			return getStudyprogram();
		case Tdt4250casePackage.COURSE__CODE:
			return getCode();
		case Tdt4250casePackage.COURSE__NAME:
			return getName();
		case Tdt4250casePackage.COURSE__CONTENT:
			return getContent();
		case Tdt4250casePackage.COURSE__CREDITS:
			return getCredits();
		case Tdt4250casePackage.COURSE__REQUIRED_COURSE:
			return getRequiredCourse();
		case Tdt4250casePackage.COURSE__RECOMMENDED_COURSE:
			return getRecommendedCourse();
		case Tdt4250casePackage.COURSE__CREDIT_REDUCTION_COURSE:
			return getCreditReductionCourse();
		case Tdt4250casePackage.COURSE__INSTANCE:
			return getInstance();
		case Tdt4250casePackage.COURSE__COURSE_WORK:
			return getCourseWork();
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
		case Tdt4250casePackage.COURSE__STUDYPROGRAM:
			getStudyprogram().clear();
			getStudyprogram().addAll((Collection<? extends Studyprogram>) newValue);
			return;
		case Tdt4250casePackage.COURSE__CODE:
			setCode((String) newValue);
			return;
		case Tdt4250casePackage.COURSE__NAME:
			setName((String) newValue);
			return;
		case Tdt4250casePackage.COURSE__CONTENT:
			setContent((String) newValue);
			return;
		case Tdt4250casePackage.COURSE__CREDITS:
			setCredits((Float) newValue);
			return;
		case Tdt4250casePackage.COURSE__REQUIRED_COURSE:
			getRequiredCourse().clear();
			getRequiredCourse().addAll((Collection<? extends Course>) newValue);
			return;
		case Tdt4250casePackage.COURSE__RECOMMENDED_COURSE:
			getRecommendedCourse().clear();
			getRecommendedCourse().addAll((Collection<? extends Course>) newValue);
			return;
		case Tdt4250casePackage.COURSE__CREDIT_REDUCTION_COURSE:
			getCreditReductionCourse().clear();
			getCreditReductionCourse().addAll((Collection<? extends CreditReductionCourse>) newValue);
			return;
		case Tdt4250casePackage.COURSE__INSTANCE:
			getInstance().clear();
			getInstance().addAll((Collection<? extends CourseInstance>) newValue);
			return;
		case Tdt4250casePackage.COURSE__COURSE_WORK:
			getCourseWork().clear();
			getCourseWork().addAll((Collection<? extends CourseWork>) newValue);
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
		case Tdt4250casePackage.COURSE__STUDYPROGRAM:
			getStudyprogram().clear();
			return;
		case Tdt4250casePackage.COURSE__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case Tdt4250casePackage.COURSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Tdt4250casePackage.COURSE__CONTENT:
			setContent(CONTENT_EDEFAULT);
			return;
		case Tdt4250casePackage.COURSE__CREDITS:
			setCredits(CREDITS_EDEFAULT);
			return;
		case Tdt4250casePackage.COURSE__REQUIRED_COURSE:
			getRequiredCourse().clear();
			return;
		case Tdt4250casePackage.COURSE__RECOMMENDED_COURSE:
			getRecommendedCourse().clear();
			return;
		case Tdt4250casePackage.COURSE__CREDIT_REDUCTION_COURSE:
			getCreditReductionCourse().clear();
			return;
		case Tdt4250casePackage.COURSE__INSTANCE:
			getInstance().clear();
			return;
		case Tdt4250casePackage.COURSE__COURSE_WORK:
			getCourseWork().clear();
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
		case Tdt4250casePackage.COURSE__STUDYPROGRAM:
			return studyprogram != null && !studyprogram.isEmpty();
		case Tdt4250casePackage.COURSE__CODE:
			return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
		case Tdt4250casePackage.COURSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Tdt4250casePackage.COURSE__CONTENT:
			return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
		case Tdt4250casePackage.COURSE__CREDITS:
			return credits != CREDITS_EDEFAULT;
		case Tdt4250casePackage.COURSE__REQUIRED_COURSE:
			return requiredCourse != null && !requiredCourse.isEmpty();
		case Tdt4250casePackage.COURSE__RECOMMENDED_COURSE:
			return recommendedCourse != null && !recommendedCourse.isEmpty();
		case Tdt4250casePackage.COURSE__CREDIT_REDUCTION_COURSE:
			return creditReductionCourse != null && !creditReductionCourse.isEmpty();
		case Tdt4250casePackage.COURSE__INSTANCE:
			return instance != null && !instance.isEmpty();
		case Tdt4250casePackage.COURSE__COURSE_WORK:
			return courseWork != null && !courseWork.isEmpty();
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
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", content: ");
		result.append(content);
		result.append(", credits: ");
		result.append(credits);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
