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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250case.Course;
import tdt4250case.CourseInstance;
import tdt4250case.CourseRole;
import tdt4250case.Department;
import tdt4250case.Examination;
import tdt4250case.Person;
import tdt4250case.Tdt4250casePackage;
import tdt4250case.Timetable;

import tdt4250case.util.Semester;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250case.impl.CourseInstanceImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseInstanceImpl#getExamination <em>Examination</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseInstanceImpl#getTimetable <em>Timetable</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseInstanceImpl#getResponsibleDepartment <em>Responsible Department</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseInstanceImpl#getRole <em>Role</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseInstanceImpl#getCourseCoordinator <em>Course Coordinator</em>}</li>
 *   <li>{@link tdt4250case.impl.CourseInstanceImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseInstanceImpl extends MinimalEObjectImpl.Container implements CourseInstance {
	/**
	 * The default value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected static final Semester SEMESTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected Semester semester = SEMESTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExamination() <em>Examination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamination()
	 * @generated
	 * @ordered
	 */
	protected Examination examination;

	/**
	 * The cached value of the '{@link #getTimetable() <em>Timetable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetable()
	 * @generated
	 * @ordered
	 */
	protected Timetable timetable;

	/**
	 * The cached value of the '{@link #getResponsibleDepartment() <em>Responsible Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleDepartment()
	 * @generated
	 * @ordered
	 */
	protected Department responsibleDepartment;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseRole> role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tdt4250casePackage.Literals.COURSE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(Semester newSemester) {
		Semester oldSemester = semester;
		semester = newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.COURSE_INSTANCE__SEMESTER,
					oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Examination getExamination() {
		return examination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExamination(Examination newExamination, NotificationChain msgs) {
		Examination oldExamination = examination;
		examination = newExamination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Tdt4250casePackage.COURSE_INSTANCE__EXAMINATION, oldExamination, newExamination);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExamination(Examination newExamination) {
		if (newExamination != examination) {
			NotificationChain msgs = null;
			if (examination != null)
				msgs = ((InternalEObject) examination).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Tdt4250casePackage.COURSE_INSTANCE__EXAMINATION, null, msgs);
			if (newExamination != null)
				msgs = ((InternalEObject) newExamination).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Tdt4250casePackage.COURSE_INSTANCE__EXAMINATION, null, msgs);
			msgs = basicSetExamination(newExamination, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.COURSE_INSTANCE__EXAMINATION,
					newExamination, newExamination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timetable getTimetable() {
		return timetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimetable(Timetable newTimetable, NotificationChain msgs) {
		Timetable oldTimetable = timetable;
		timetable = newTimetable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Tdt4250casePackage.COURSE_INSTANCE__TIMETABLE, oldTimetable, newTimetable);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimetable(Timetable newTimetable) {
		if (newTimetable != timetable) {
			NotificationChain msgs = null;
			if (timetable != null)
				msgs = ((InternalEObject) timetable).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Tdt4250casePackage.COURSE_INSTANCE__TIMETABLE, null, msgs);
			if (newTimetable != null)
				msgs = ((InternalEObject) newTimetable).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Tdt4250casePackage.COURSE_INSTANCE__TIMETABLE, null, msgs);
			msgs = basicSetTimetable(newTimetable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.COURSE_INSTANCE__TIMETABLE,
					newTimetable, newTimetable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department getResponsibleDepartment() {
		if (responsibleDepartment != null && responsibleDepartment.eIsProxy()) {
			InternalEObject oldResponsibleDepartment = (InternalEObject) responsibleDepartment;
			responsibleDepartment = (Department) eResolveProxy(oldResponsibleDepartment);
			if (responsibleDepartment != oldResponsibleDepartment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Tdt4250casePackage.COURSE_INSTANCE__RESPONSIBLE_DEPARTMENT, oldResponsibleDepartment,
							responsibleDepartment));
			}
		}
		return responsibleDepartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department basicGetResponsibleDepartment() {
		return responsibleDepartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibleDepartment(Department newResponsibleDepartment) {
		Department oldResponsibleDepartment = responsibleDepartment;
		responsibleDepartment = newResponsibleDepartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Tdt4250casePackage.COURSE_INSTANCE__RESPONSIBLE_DEPARTMENT, oldResponsibleDepartment,
					responsibleDepartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseRole> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<CourseRole>(CourseRole.class, this,
					Tdt4250casePackage.COURSE_INSTANCE__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getCourseCoordinator() {
		Person courseCoordinator = basicGetCourseCoordinator();
		return courseCoordinator != null && courseCoordinator.eIsProxy()
				? (Person) eResolveProxy((InternalEObject) courseCoordinator)
				: courseCoordinator;
	}

	protected static final String COURSE_COORDINATOR_ROLE_NAME = "Course coordinator";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Person basicGetCourseCoordinator() {
		for (CourseRole role : getRole()) {
			if (role.getName() == COURSE_COORDINATOR_ROLE_NAME) return role.getPerson().get(0);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseCoordinator(Person newCourseCoordinator) {
		// TODO: implement this method to set the 'Course Coordinator' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getCourse() {
		if (eContainerFeatureID() != Tdt4250casePackage.COURSE_INSTANCE__COURSE)
			return null;
		return (Course) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourse(Course newCourse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCourse, Tdt4250casePackage.COURSE_INSTANCE__COURSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourse(Course newCourse) {
		if (newCourse != eInternalContainer()
				|| (eContainerFeatureID() != Tdt4250casePackage.COURSE_INSTANCE__COURSE && newCourse != null)) {
			if (EcoreUtil.isAncestor(this, newCourse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCourse != null)
				msgs = ((InternalEObject) newCourse).eInverseAdd(this, Tdt4250casePackage.COURSE__INSTANCE,
						Course.class, msgs);
			msgs = basicSetCourse(newCourse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250casePackage.COURSE_INSTANCE__COURSE, newCourse,
					newCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tdt4250casePackage.COURSE_INSTANCE__COURSE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetCourse((Course) otherEnd, msgs);
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
		case Tdt4250casePackage.COURSE_INSTANCE__EXAMINATION:
			return basicSetExamination(null, msgs);
		case Tdt4250casePackage.COURSE_INSTANCE__TIMETABLE:
			return basicSetTimetable(null, msgs);
		case Tdt4250casePackage.COURSE_INSTANCE__ROLE:
			return ((InternalEList<?>) getRole()).basicRemove(otherEnd, msgs);
		case Tdt4250casePackage.COURSE_INSTANCE__COURSE:
			return basicSetCourse(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case Tdt4250casePackage.COURSE_INSTANCE__COURSE:
			return eInternalContainer().eInverseRemove(this, Tdt4250casePackage.COURSE__INSTANCE, Course.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Tdt4250casePackage.COURSE_INSTANCE__SEMESTER:
			return getSemester();
		case Tdt4250casePackage.COURSE_INSTANCE__EXAMINATION:
			return getExamination();
		case Tdt4250casePackage.COURSE_INSTANCE__TIMETABLE:
			return getTimetable();
		case Tdt4250casePackage.COURSE_INSTANCE__RESPONSIBLE_DEPARTMENT:
			if (resolve)
				return getResponsibleDepartment();
			return basicGetResponsibleDepartment();
		case Tdt4250casePackage.COURSE_INSTANCE__ROLE:
			return getRole();
		case Tdt4250casePackage.COURSE_INSTANCE__COURSE_COORDINATOR:
			if (resolve)
				return getCourseCoordinator();
			return basicGetCourseCoordinator();
		case Tdt4250casePackage.COURSE_INSTANCE__COURSE:
			return getCourse();
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
		case Tdt4250casePackage.COURSE_INSTANCE__SEMESTER:
			setSemester((Semester) newValue);
			return;
		case Tdt4250casePackage.COURSE_INSTANCE__EXAMINATION:
			setExamination((Examination) newValue);
			return;
		case Tdt4250casePackage.COURSE_INSTANCE__TIMETABLE:
			setTimetable((Timetable) newValue);
			return;
		case Tdt4250casePackage.COURSE_INSTANCE__RESPONSIBLE_DEPARTMENT:
			setResponsibleDepartment((Department) newValue);
			return;
		case Tdt4250casePackage.COURSE_INSTANCE__ROLE:
			getRole().clear();
			getRole().addAll((Collection<? extends CourseRole>) newValue);
			return;
		case Tdt4250casePackage.COURSE_INSTANCE__COURSE_COORDINATOR:
			setCourseCoordinator((Person) newValue);
			return;
		case Tdt4250casePackage.COURSE_INSTANCE__COURSE:
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
		case Tdt4250casePackage.COURSE_INSTANCE__SEMESTER:
			setSemester(SEMESTER_EDEFAULT);
			return;
		case Tdt4250casePackage.COURSE_INSTANCE__EXAMINATION:
			setExamination((Examination) null);
			return;
		case Tdt4250casePackage.COURSE_INSTANCE__TIMETABLE:
			setTimetable((Timetable) null);
			return;
		case Tdt4250casePackage.COURSE_INSTANCE__RESPONSIBLE_DEPARTMENT:
			setResponsibleDepartment((Department) null);
			return;
		case Tdt4250casePackage.COURSE_INSTANCE__ROLE:
			getRole().clear();
			return;
		case Tdt4250casePackage.COURSE_INSTANCE__COURSE_COORDINATOR:
			setCourseCoordinator((Person) null);
			return;
		case Tdt4250casePackage.COURSE_INSTANCE__COURSE:
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
		case Tdt4250casePackage.COURSE_INSTANCE__SEMESTER:
			return SEMESTER_EDEFAULT == null ? semester != null : !SEMESTER_EDEFAULT.equals(semester);
		case Tdt4250casePackage.COURSE_INSTANCE__EXAMINATION:
			return examination != null;
		case Tdt4250casePackage.COURSE_INSTANCE__TIMETABLE:
			return timetable != null;
		case Tdt4250casePackage.COURSE_INSTANCE__RESPONSIBLE_DEPARTMENT:
			return responsibleDepartment != null;
		case Tdt4250casePackage.COURSE_INSTANCE__ROLE:
			return role != null && !role.isEmpty();
		case Tdt4250casePackage.COURSE_INSTANCE__COURSE_COORDINATOR:
			return basicGetCourseCoordinator() != null;
		case Tdt4250casePackage.COURSE_INSTANCE__COURSE:
			return getCourse() != null;
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
		result.append(" (semester: ");
		result.append(semester);
		result.append(')');
		return result.toString();
	}

} //CourseInstanceImpl
