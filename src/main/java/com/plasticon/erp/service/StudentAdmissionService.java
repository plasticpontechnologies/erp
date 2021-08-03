package com.plasticon.erp.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.StaffDetails;
import com.plasticon.erp.model.StudentAdmission;
import com.plasticon.erp.model.SubjectDetails;
import com.plasticon.erp.repository.StudentAdmissionRepository;


@Service

public class StudentAdmissionService {
	
	@Autowired
	StudentAdmissionRepository studentRepository;
		public List<StudentAdmission> getStudentDetails() {
			return studentRepository.findAll();

		}

		public void saveStudentDetails(StudentAdmission student) {
			studentRepository.save(student);
			

		}
		@Transactional
		public void removeStudentDetails(int id) {
			studentRepository.deleteById(id);
		}
		
		public List<StudentAdmission> findByClassId(int clasId) {
			return studentRepository.findByClassId(clasId);
		}

		public List<StudentAdmission> findByAdmissionNumber() {	
			return studentRepository.findAllOrderByadmissionNumberAsc();
		}

		public List<StudentAdmission> findByStudentName() {
			return studentRepository.findAllOrderByStudentNameAsc();
		}

}
