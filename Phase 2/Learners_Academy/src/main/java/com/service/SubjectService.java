package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.dao.SubjectDao;
import com.entity.Subject;

public class SubjectService {

	SubjectDao pd = new SubjectDao();
  
	public String storeSubject(Subject subject) {
		if (pd.findSubjectByName(subject.getName()) != null)
			return "Subject already exists";
		else 
			return pd.storeSubject(subject);
	}
	
	public String deleteSubject (int id) {
		return pd.deleteSubject(id);
	}
	
	public String findSubjectById (int id) {
		Subject pp = pd.findSubjectById(id);
		if (pp == null) 
			return "Subject not found";
		else 
			return pp.getName();
	}
	
	public Subject findSubjectByName (String name) {
		List<Subject> pp = pd.findSubjectByName(name);
		return pp.get(0);
	}
	
	public List<String> findSubjectAllSubject() {
		List<String> output = new ArrayList<String>();
		List<Subject> subjects = pd.findSubjectAllSubject();
		Iterator<Subject> li = subjects.iterator();
		while (li.hasNext()) {
			Subject subject = li.next(); 
			output.add(subject.getName());
		}
		return output;
	}
	
}
