/**
 */
package tdt4250case.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tdt4250case.*;

import tdt4250case.util.ExaminationActivityWeight;
import tdt4250case.util.Semester;
import tdt4250case.util.Timeslot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tdt4250caseFactoryImpl extends EFactoryImpl implements Tdt4250caseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Tdt4250caseFactory init() {
		try {
			Tdt4250caseFactory theTdt4250caseFactory = (Tdt4250caseFactory) EPackage.Registry.INSTANCE
					.getEFactory(Tdt4250casePackage.eNS_URI);
			if (theTdt4250caseFactory != null) {
				return theTdt4250caseFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Tdt4250caseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tdt4250caseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Tdt4250casePackage.COURSE:
			return createCourse();
		case Tdt4250casePackage.COURSE_CREDIT_REDUCTION:
			return createCourseCreditReduction();
		case Tdt4250casePackage.STUDYPROGRAM:
			return createStudyprogram();
		case Tdt4250casePackage.COURSE_INSTANCE:
			return createCourseInstance();
		case Tdt4250casePackage.EXAMINATION:
			return createExamination();
		case Tdt4250casePackage.EXAMINATION_ACTIVITY:
			return createExaminationActivity();
		case Tdt4250casePackage.TIMETABLE:
			return createTimetable();
		case Tdt4250casePackage.SCHEDULED_ACTIVITY:
			return createScheduledActivity();
		case Tdt4250casePackage.DEPARTMENT:
			return createDepartment();
		case Tdt4250casePackage.PERSON:
			return createPerson();
		case Tdt4250casePackage.COURSE_ROLE:
			return createCourseRole();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Tdt4250casePackage.SEMESTER:
			return createSemesterFromString(eDataType, initialValue);
		case Tdt4250casePackage.TIMESLOT:
			return createTimeslotFromString(eDataType, initialValue);
		case Tdt4250casePackage.EXAMINATION_ACTIVITY_WEIGHT:
			return createExaminationActivityWeightFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Tdt4250casePackage.SEMESTER:
			return convertSemesterToString(eDataType, instanceValue);
		case Tdt4250casePackage.TIMESLOT:
			return convertTimeslotToString(eDataType, instanceValue);
		case Tdt4250casePackage.EXAMINATION_ACTIVITY_WEIGHT:
			return convertExaminationActivityWeightToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseCreditReduction createCourseCreditReduction() {
		CourseCreditReductionImpl courseCreditReduction = new CourseCreditReductionImpl();
		return courseCreditReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Studyprogram createStudyprogram() {
		StudyprogramImpl studyprogram = new StudyprogramImpl();
		return studyprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseInstance createCourseInstance() {
		CourseInstanceImpl courseInstance = new CourseInstanceImpl();
		return courseInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Examination createExamination() {
		ExaminationImpl examination = new ExaminationImpl();
		return examination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExaminationActivity createExaminationActivity() {
		ExaminationActivityImpl examinationActivity = new ExaminationActivityImpl();
		return examinationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timetable createTimetable() {
		TimetableImpl timetable = new TimetableImpl();
		return timetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledActivity createScheduledActivity() {
		ScheduledActivityImpl scheduledActivity = new ScheduledActivityImpl();
		return scheduledActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseRole createCourseRole() {
		CourseRoleImpl courseRole = new CourseRoleImpl();
		return courseRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Semester createSemesterFromString(EDataType eDataType, String initialValue) {
		return Semester.parse(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertSemesterToString(EDataType eDataType, Object instanceValue) {
		return instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Timeslot createTimeslotFromString(EDataType eDataType, String initialValue) {
		return Timeslot.parse(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertTimeslotToString(EDataType eDataType, Object instanceValue) {
		return instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ExaminationActivityWeight createExaminationActivityWeightFromString(EDataType eDataType,
			String initialValue) {
		return ExaminationActivityWeight.parse(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertExaminationActivityWeightToString(EDataType eDataType, Object instanceValue) {
		return instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tdt4250casePackage getTdt4250casePackage() {
		return (Tdt4250casePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Tdt4250casePackage getPackage() {
		return Tdt4250casePackage.eINSTANCE;
	}

} //Tdt4250caseFactoryImpl
