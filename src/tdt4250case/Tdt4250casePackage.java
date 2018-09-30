/**
 */
package tdt4250case;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tdt4250case.Tdt4250caseFactory
 * @model kind="package"
 * @generated
 */
public interface Tdt4250casePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tdt4250case";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250case/model/tdt4250case.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tdt4250case";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tdt4250casePackage eINSTANCE = tdt4250case.impl.Tdt4250casePackageImpl.init();

	/**
	 * The meta object id for the '{@link tdt4250case.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250case.impl.CourseImpl
	 * @see tdt4250case.impl.Tdt4250casePackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Studyprogram</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__STUDYPROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 4;

	/**
	 * The feature id for the '<em><b>Required Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__REQUIRED_COURSE = 5;

	/**
	 * The feature id for the '<em><b>Recommended Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__RECOMMENDED_COURSE = 6;

	/**
	 * The feature id for the '<em><b>Credit Reduction Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDIT_REDUCTION_COURSE = 7;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Course Work</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_WORK = 9;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250case.impl.CreditReductionCourseImpl <em>Credit Reduction Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250case.impl.CreditReductionCourseImpl
	 * @see tdt4250case.impl.Tdt4250casePackageImpl#getCreditReductionCourse()
	 * @generated
	 */
	int CREDIT_REDUCTION_COURSE = 1;

	/**
	 * The feature id for the '<em><b>Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REDUCTION_COURSE__REDUCTION = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REDUCTION_COURSE__COURSE = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REDUCTION_COURSE__FROM = 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REDUCTION_COURSE__TO = 3;

	/**
	 * The number of structural features of the '<em>Credit Reduction Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REDUCTION_COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Credit Reduction Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REDUCTION_COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250case.impl.StudyprogramImpl <em>Studyprogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250case.impl.StudyprogramImpl
	 * @see tdt4250case.impl.Tdt4250casePackageImpl#getStudyprogram()
	 * @generated
	 */
	int STUDYPROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDYPROGRAM__CODE = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDYPROGRAM__COURSE = 1;

	/**
	 * The number of structural features of the '<em>Studyprogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDYPROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Studyprogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDYPROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250case.impl.CourseInstanceImpl <em>Course Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250case.impl.CourseInstanceImpl
	 * @see tdt4250case.impl.Tdt4250casePackageImpl#getCourseInstance()
	 * @generated
	 */
	int COURSE_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__SEMESTER = 0;

	/**
	 * The feature id for the '<em><b>Examination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__EXAMINATION = 1;

	/**
	 * The feature id for the '<em><b>Timetable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__TIMETABLE = 2;

	/**
	 * The feature id for the '<em><b>Responsible Department</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__RESPONSIBLE_DEPARTMENT = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__ROLE = 4;

	/**
	 * The feature id for the '<em><b>Course Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__COURSE_COORDINATOR = 5;

	/**
	 * The feature id for the '<em><b>Course</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__COURSE = 6;

	/**
	 * The number of structural features of the '<em>Course Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Course Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250case.impl.ExaminationImpl <em>Examination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250case.impl.ExaminationImpl
	 * @see tdt4250case.impl.Tdt4250casePackageImpl#getExamination()
	 * @generated
	 */
	int EXAMINATION = 4;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__ACTIVITY = 0;

	/**
	 * The number of structural features of the '<em>Examination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Examination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250case.impl.ExaminationActivityImpl <em>Examination Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250case.impl.ExaminationActivityImpl
	 * @see tdt4250case.impl.Tdt4250casePackageImpl#getExaminationActivity()
	 * @generated
	 */
	int EXAMINATION_ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Evaluation Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_ACTIVITY__EVALUATION_FORM = 0;

	/**
	 * The feature id for the '<em><b>Weighting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_ACTIVITY__WEIGHTING = 1;

	/**
	 * The number of structural features of the '<em>Examination Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_ACTIVITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Examination Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250case.impl.TimetableImpl <em>Timetable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250case.impl.TimetableImpl
	 * @see tdt4250case.impl.Tdt4250casePackageImpl#getTimetable()
	 * @generated
	 */
	int TIMETABLE = 6;

	/**
	 * The feature id for the '<em><b>Scheduled Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__SCHEDULED_ACTIVITY = 0;

	/**
	 * The number of structural features of the '<em>Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250case.impl.ScheduledActivityImpl <em>Scheduled Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250case.impl.ScheduledActivityImpl
	 * @see tdt4250case.impl.Tdt4250casePackageImpl#getScheduledActivity()
	 * @generated
	 */
	int SCHEDULED_ACTIVITY = 7;

	/**
	 * The feature id for the '<em><b>Timeslot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_ACTIVITY__TIMESLOT = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_ACTIVITY__ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_ACTIVITY__ROOM = 2;

	/**
	 * The feature id for the '<em><b>Reserved For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_ACTIVITY__RESERVED_FOR = 3;

	/**
	 * The number of structural features of the '<em>Scheduled Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_ACTIVITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Scheduled Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250case.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250case.impl.DepartmentImpl
	 * @see tdt4250case.impl.Tdt4250casePackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 8;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__EMPLOYEE = 2;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250case.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250case.impl.PersonImpl
	 * @see tdt4250case.impl.Tdt4250casePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 9;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLE = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250case.impl.CourseRoleImpl <em>Course Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250case.impl.CourseRoleImpl
	 * @see tdt4250case.impl.Tdt4250casePackageImpl#getCourseRole()
	 * @generated
	 */
	int COURSE_ROLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ROLE__PERSON = 1;

	/**
	 * The number of structural features of the '<em>Course Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ROLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Course Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250case.impl.CourseWorkImpl <em>Course Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250case.impl.CourseWorkImpl
	 * @see tdt4250case.impl.Tdt4250casePackageImpl#getCourseWork()
	 * @generated
	 */
	int COURSE_WORK = 11;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK__HOURS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Course Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Course Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Semester</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250case.util.Semester
	 * @see tdt4250case.impl.Tdt4250casePackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 12;

	/**
	 * The meta object id for the '<em>Timeslot</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250case.util.Timeslot
	 * @see tdt4250case.impl.Tdt4250casePackageImpl#getTimeslot()
	 * @generated
	 */
	int TIMESLOT = 13;

	/**
	 * The meta object id for the '<em>Examination Activity Weight</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250case.util.ExaminationActivityWeight
	 * @see tdt4250case.impl.Tdt4250casePackageImpl#getExaminationActivityWeight()
	 * @generated
	 */
	int EXAMINATION_ACTIVITY_WEIGHT = 14;

	/**
	 * Returns the meta object for class '{@link tdt4250case.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see tdt4250case.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250case.Course#getStudyprogram <em>Studyprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Studyprogram</em>'.
	 * @see tdt4250case.Course#getStudyprogram()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Studyprogram();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tdt4250case.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250case.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.Course#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see tdt4250case.Course#getContent()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Content();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see tdt4250case.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250case.Course#getRequiredCourse <em>Required Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Course</em>'.
	 * @see tdt4250case.Course#getRequiredCourse()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_RequiredCourse();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250case.Course#getRecommendedCourse <em>Recommended Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recommended Course</em>'.
	 * @see tdt4250case.Course#getRecommendedCourse()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_RecommendedCourse();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250case.Course#getCreditReductionCourse <em>Credit Reduction Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Credit Reduction Course</em>'.
	 * @see tdt4250case.Course#getCreditReductionCourse()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_CreditReductionCourse();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250case.Course#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance</em>'.
	 * @see tdt4250case.Course#getInstance()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Instance();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250case.Course#getCourseWork <em>Course Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course Work</em>'.
	 * @see tdt4250case.Course#getCourseWork()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_CourseWork();

	/**
	 * Returns the meta object for class '{@link tdt4250case.CreditReductionCourse <em>Credit Reduction Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit Reduction Course</em>'.
	 * @see tdt4250case.CreditReductionCourse
	 * @generated
	 */
	EClass getCreditReductionCourse();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.CreditReductionCourse#getReduction <em>Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reduction</em>'.
	 * @see tdt4250case.CreditReductionCourse#getReduction()
	 * @see #getCreditReductionCourse()
	 * @generated
	 */
	EAttribute getCreditReductionCourse_Reduction();

	/**
	 * Returns the meta object for the reference '{@link tdt4250case.CreditReductionCourse#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see tdt4250case.CreditReductionCourse#getCourse()
	 * @see #getCreditReductionCourse()
	 * @generated
	 */
	EReference getCreditReductionCourse_Course();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.CreditReductionCourse#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see tdt4250case.CreditReductionCourse#getFrom()
	 * @see #getCreditReductionCourse()
	 * @generated
	 */
	EAttribute getCreditReductionCourse_From();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.CreditReductionCourse#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see tdt4250case.CreditReductionCourse#getTo()
	 * @see #getCreditReductionCourse()
	 * @generated
	 */
	EAttribute getCreditReductionCourse_To();

	/**
	 * Returns the meta object for class '{@link tdt4250case.Studyprogram <em>Studyprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Studyprogram</em>'.
	 * @see tdt4250case.Studyprogram
	 * @generated
	 */
	EClass getStudyprogram();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.Studyprogram#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tdt4250case.Studyprogram#getCode()
	 * @see #getStudyprogram()
	 * @generated
	 */
	EAttribute getStudyprogram_Code();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250case.Studyprogram#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course</em>'.
	 * @see tdt4250case.Studyprogram#getCourse()
	 * @see #getStudyprogram()
	 * @generated
	 */
	EReference getStudyprogram_Course();

	/**
	 * Returns the meta object for class '{@link tdt4250case.CourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Instance</em>'.
	 * @see tdt4250case.CourseInstance
	 * @generated
	 */
	EClass getCourseInstance();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.CourseInstance#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see tdt4250case.CourseInstance#getSemester()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EAttribute getCourseInstance_Semester();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250case.CourseInstance#getExamination <em>Examination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Examination</em>'.
	 * @see tdt4250case.CourseInstance#getExamination()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Examination();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250case.CourseInstance#getTimetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timetable</em>'.
	 * @see tdt4250case.CourseInstance#getTimetable()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Timetable();

	/**
	 * Returns the meta object for the reference '{@link tdt4250case.CourseInstance#getResponsibleDepartment <em>Responsible Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible Department</em>'.
	 * @see tdt4250case.CourseInstance#getResponsibleDepartment()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_ResponsibleDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250case.CourseInstance#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see tdt4250case.CourseInstance#getRole()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Role();

	/**
	 * Returns the meta object for the reference '{@link tdt4250case.CourseInstance#getCourseCoordinator <em>Course Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course Coordinator</em>'.
	 * @see tdt4250case.CourseInstance#getCourseCoordinator()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_CourseCoordinator();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250case.CourseInstance#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Course</em>'.
	 * @see tdt4250case.CourseInstance#getCourse()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Course();

	/**
	 * Returns the meta object for class '{@link tdt4250case.Examination <em>Examination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examination</em>'.
	 * @see tdt4250case.Examination
	 * @generated
	 */
	EClass getExamination();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250case.Examination#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see tdt4250case.Examination#getActivity()
	 * @see #getExamination()
	 * @generated
	 */
	EReference getExamination_Activity();

	/**
	 * Returns the meta object for class '{@link tdt4250case.ExaminationActivity <em>Examination Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examination Activity</em>'.
	 * @see tdt4250case.ExaminationActivity
	 * @generated
	 */
	EClass getExaminationActivity();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.ExaminationActivity#getEvaluationForm <em>Evaluation Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluation Form</em>'.
	 * @see tdt4250case.ExaminationActivity#getEvaluationForm()
	 * @see #getExaminationActivity()
	 * @generated
	 */
	EAttribute getExaminationActivity_EvaluationForm();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.ExaminationActivity#getWeighting <em>Weighting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weighting</em>'.
	 * @see tdt4250case.ExaminationActivity#getWeighting()
	 * @see #getExaminationActivity()
	 * @generated
	 */
	EAttribute getExaminationActivity_Weighting();

	/**
	 * Returns the meta object for class '{@link tdt4250case.Timetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timetable</em>'.
	 * @see tdt4250case.Timetable
	 * @generated
	 */
	EClass getTimetable();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250case.Timetable#getScheduledActivity <em>Scheduled Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduled Activity</em>'.
	 * @see tdt4250case.Timetable#getScheduledActivity()
	 * @see #getTimetable()
	 * @generated
	 */
	EReference getTimetable_ScheduledActivity();

	/**
	 * Returns the meta object for class '{@link tdt4250case.ScheduledActivity <em>Scheduled Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduled Activity</em>'.
	 * @see tdt4250case.ScheduledActivity
	 * @generated
	 */
	EClass getScheduledActivity();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.ScheduledActivity#getTimeslot <em>Timeslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeslot</em>'.
	 * @see tdt4250case.ScheduledActivity#getTimeslot()
	 * @see #getScheduledActivity()
	 * @generated
	 */
	EAttribute getScheduledActivity_Timeslot();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.ScheduledActivity#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity</em>'.
	 * @see tdt4250case.ScheduledActivity#getActivity()
	 * @see #getScheduledActivity()
	 * @generated
	 */
	EAttribute getScheduledActivity_Activity();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.ScheduledActivity#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room</em>'.
	 * @see tdt4250case.ScheduledActivity#getRoom()
	 * @see #getScheduledActivity()
	 * @generated
	 */
	EAttribute getScheduledActivity_Room();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250case.ScheduledActivity#getReservedFor <em>Reserved For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reserved For</em>'.
	 * @see tdt4250case.ScheduledActivity#getReservedFor()
	 * @see #getScheduledActivity()
	 * @generated
	 */
	EReference getScheduledActivity_ReservedFor();

	/**
	 * Returns the meta object for class '{@link tdt4250case.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see tdt4250case.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.Department#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tdt4250case.Department#getCode()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Code();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250case.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250case.Department#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employee</em>'.
	 * @see tdt4250case.Department#getEmployee()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Employee();

	/**
	 * Returns the meta object for class '{@link tdt4250case.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see tdt4250case.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.Person#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see tdt4250case.Person#getUsername()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Username();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250case.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250case.Person#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role</em>'.
	 * @see tdt4250case.Person#getRole()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Role();

	/**
	 * Returns the meta object for class '{@link tdt4250case.CourseRole <em>Course Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Role</em>'.
	 * @see tdt4250case.CourseRole
	 * @generated
	 */
	EClass getCourseRole();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.CourseRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250case.CourseRole#getName()
	 * @see #getCourseRole()
	 * @generated
	 */
	EAttribute getCourseRole_Name();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250case.CourseRole#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person</em>'.
	 * @see tdt4250case.CourseRole#getPerson()
	 * @see #getCourseRole()
	 * @generated
	 */
	EReference getCourseRole_Person();

	/**
	 * Returns the meta object for class '{@link tdt4250case.CourseWork <em>Course Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Work</em>'.
	 * @see tdt4250case.CourseWork
	 * @generated
	 */
	EClass getCourseWork();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.CourseWork#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see tdt4250case.CourseWork#getHours()
	 * @see #getCourseWork()
	 * @generated
	 */
	EAttribute getCourseWork_Hours();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250case.CourseWork#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tdt4250case.CourseWork#getType()
	 * @see #getCourseWork()
	 * @generated
	 */
	EAttribute getCourseWork_Type();

	/**
	 * Returns the meta object for data type '{@link tdt4250case.util.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Semester</em>'.
	 * @see tdt4250case.util.Semester
	 * @model instanceClass="tdt4250case.util.Semester"
	 * @generated
	 */
	EDataType getSemester();

	/**
	 * Returns the meta object for data type '{@link tdt4250case.util.Timeslot <em>Timeslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timeslot</em>'.
	 * @see tdt4250case.util.Timeslot
	 * @model instanceClass="tdt4250case.util.Timeslot"
	 * @generated
	 */
	EDataType getTimeslot();

	/**
	 * Returns the meta object for data type '{@link tdt4250case.util.ExaminationActivityWeight <em>Examination Activity Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Examination Activity Weight</em>'.
	 * @see tdt4250case.util.ExaminationActivityWeight
	 * @model instanceClass="tdt4250case.util.ExaminationActivityWeight"
	 * @generated
	 */
	EDataType getExaminationActivityWeight();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Tdt4250caseFactory getTdt4250caseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tdt4250case.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250case.impl.CourseImpl
		 * @see tdt4250case.impl.Tdt4250casePackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Studyprogram</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__STUDYPROGRAM = eINSTANCE.getCourse_Studyprogram();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CONTENT = eINSTANCE.getCourse_Content();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Required Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__REQUIRED_COURSE = eINSTANCE.getCourse_RequiredCourse();

		/**
		 * The meta object literal for the '<em><b>Recommended Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__RECOMMENDED_COURSE = eINSTANCE.getCourse_RecommendedCourse();

		/**
		 * The meta object literal for the '<em><b>Credit Reduction Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__CREDIT_REDUCTION_COURSE = eINSTANCE.getCourse_CreditReductionCourse();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__INSTANCE = eINSTANCE.getCourse_Instance();

		/**
		 * The meta object literal for the '<em><b>Course Work</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COURSE_WORK = eINSTANCE.getCourse_CourseWork();

		/**
		 * The meta object literal for the '{@link tdt4250case.impl.CreditReductionCourseImpl <em>Credit Reduction Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250case.impl.CreditReductionCourseImpl
		 * @see tdt4250case.impl.Tdt4250casePackageImpl#getCreditReductionCourse()
		 * @generated
		 */
		EClass CREDIT_REDUCTION_COURSE = eINSTANCE.getCreditReductionCourse();

		/**
		 * The meta object literal for the '<em><b>Reduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_REDUCTION_COURSE__REDUCTION = eINSTANCE.getCreditReductionCourse_Reduction();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREDIT_REDUCTION_COURSE__COURSE = eINSTANCE.getCreditReductionCourse_Course();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_REDUCTION_COURSE__FROM = eINSTANCE.getCreditReductionCourse_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_REDUCTION_COURSE__TO = eINSTANCE.getCreditReductionCourse_To();

		/**
		 * The meta object literal for the '{@link tdt4250case.impl.StudyprogramImpl <em>Studyprogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250case.impl.StudyprogramImpl
		 * @see tdt4250case.impl.Tdt4250casePackageImpl#getStudyprogram()
		 * @generated
		 */
		EClass STUDYPROGRAM = eINSTANCE.getStudyprogram();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDYPROGRAM__CODE = eINSTANCE.getStudyprogram_Code();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDYPROGRAM__COURSE = eINSTANCE.getStudyprogram_Course();

		/**
		 * The meta object literal for the '{@link tdt4250case.impl.CourseInstanceImpl <em>Course Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250case.impl.CourseInstanceImpl
		 * @see tdt4250case.impl.Tdt4250casePackageImpl#getCourseInstance()
		 * @generated
		 */
		EClass COURSE_INSTANCE = eINSTANCE.getCourseInstance();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_INSTANCE__SEMESTER = eINSTANCE.getCourseInstance_Semester();

		/**
		 * The meta object literal for the '<em><b>Examination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__EXAMINATION = eINSTANCE.getCourseInstance_Examination();

		/**
		 * The meta object literal for the '<em><b>Timetable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__TIMETABLE = eINSTANCE.getCourseInstance_Timetable();

		/**
		 * The meta object literal for the '<em><b>Responsible Department</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__RESPONSIBLE_DEPARTMENT = eINSTANCE.getCourseInstance_ResponsibleDepartment();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__ROLE = eINSTANCE.getCourseInstance_Role();

		/**
		 * The meta object literal for the '<em><b>Course Coordinator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__COURSE_COORDINATOR = eINSTANCE.getCourseInstance_CourseCoordinator();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__COURSE = eINSTANCE.getCourseInstance_Course();

		/**
		 * The meta object literal for the '{@link tdt4250case.impl.ExaminationImpl <em>Examination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250case.impl.ExaminationImpl
		 * @see tdt4250case.impl.Tdt4250casePackageImpl#getExamination()
		 * @generated
		 */
		EClass EXAMINATION = eINSTANCE.getExamination();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMINATION__ACTIVITY = eINSTANCE.getExamination_Activity();

		/**
		 * The meta object literal for the '{@link tdt4250case.impl.ExaminationActivityImpl <em>Examination Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250case.impl.ExaminationActivityImpl
		 * @see tdt4250case.impl.Tdt4250casePackageImpl#getExaminationActivity()
		 * @generated
		 */
		EClass EXAMINATION_ACTIVITY = eINSTANCE.getExaminationActivity();

		/**
		 * The meta object literal for the '<em><b>Evaluation Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_ACTIVITY__EVALUATION_FORM = eINSTANCE.getExaminationActivity_EvaluationForm();

		/**
		 * The meta object literal for the '<em><b>Weighting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_ACTIVITY__WEIGHTING = eINSTANCE.getExaminationActivity_Weighting();

		/**
		 * The meta object literal for the '{@link tdt4250case.impl.TimetableImpl <em>Timetable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250case.impl.TimetableImpl
		 * @see tdt4250case.impl.Tdt4250casePackageImpl#getTimetable()
		 * @generated
		 */
		EClass TIMETABLE = eINSTANCE.getTimetable();

		/**
		 * The meta object literal for the '<em><b>Scheduled Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE__SCHEDULED_ACTIVITY = eINSTANCE.getTimetable_ScheduledActivity();

		/**
		 * The meta object literal for the '{@link tdt4250case.impl.ScheduledActivityImpl <em>Scheduled Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250case.impl.ScheduledActivityImpl
		 * @see tdt4250case.impl.Tdt4250casePackageImpl#getScheduledActivity()
		 * @generated
		 */
		EClass SCHEDULED_ACTIVITY = eINSTANCE.getScheduledActivity();

		/**
		 * The meta object literal for the '<em><b>Timeslot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_ACTIVITY__TIMESLOT = eINSTANCE.getScheduledActivity_Timeslot();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_ACTIVITY__ACTIVITY = eINSTANCE.getScheduledActivity_Activity();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_ACTIVITY__ROOM = eINSTANCE.getScheduledActivity_Room();

		/**
		 * The meta object literal for the '<em><b>Reserved For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULED_ACTIVITY__RESERVED_FOR = eINSTANCE.getScheduledActivity_ReservedFor();

		/**
		 * The meta object literal for the '{@link tdt4250case.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250case.impl.DepartmentImpl
		 * @see tdt4250case.impl.Tdt4250casePackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__CODE = eINSTANCE.getDepartment_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__EMPLOYEE = eINSTANCE.getDepartment_Employee();

		/**
		 * The meta object literal for the '{@link tdt4250case.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250case.impl.PersonImpl
		 * @see tdt4250case.impl.Tdt4250casePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__USERNAME = eINSTANCE.getPerson_Username();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ROLE = eINSTANCE.getPerson_Role();

		/**
		 * The meta object literal for the '{@link tdt4250case.impl.CourseRoleImpl <em>Course Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250case.impl.CourseRoleImpl
		 * @see tdt4250case.impl.Tdt4250casePackageImpl#getCourseRole()
		 * @generated
		 */
		EClass COURSE_ROLE = eINSTANCE.getCourseRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_ROLE__NAME = eINSTANCE.getCourseRole_Name();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_ROLE__PERSON = eINSTANCE.getCourseRole_Person();

		/**
		 * The meta object literal for the '{@link tdt4250case.impl.CourseWorkImpl <em>Course Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250case.impl.CourseWorkImpl
		 * @see tdt4250case.impl.Tdt4250casePackageImpl#getCourseWork()
		 * @generated
		 */
		EClass COURSE_WORK = eINSTANCE.getCourseWork();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_WORK__HOURS = eINSTANCE.getCourseWork_Hours();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_WORK__TYPE = eINSTANCE.getCourseWork_Type();

		/**
		 * The meta object literal for the '<em>Semester</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250case.util.Semester
		 * @see tdt4250case.impl.Tdt4250casePackageImpl#getSemester()
		 * @generated
		 */
		EDataType SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em>Timeslot</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250case.util.Timeslot
		 * @see tdt4250case.impl.Tdt4250casePackageImpl#getTimeslot()
		 * @generated
		 */
		EDataType TIMESLOT = eINSTANCE.getTimeslot();

		/**
		 * The meta object literal for the '<em>Examination Activity Weight</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250case.util.ExaminationActivityWeight
		 * @see tdt4250case.impl.Tdt4250casePackageImpl#getExaminationActivityWeight()
		 * @generated
		 */
		EDataType EXAMINATION_ACTIVITY_WEIGHT = eINSTANCE.getExaminationActivityWeight();

	}

} //Tdt4250casePackage
