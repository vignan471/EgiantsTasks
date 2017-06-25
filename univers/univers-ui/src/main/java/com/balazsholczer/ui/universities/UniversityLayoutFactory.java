package com.balazsholczer.ui.universities;

import org.springframework.beans.factory.annotation.Autowired;

import com.balazsholczer.service.showalluniversities.ShowAllUniversitiesService;
import com.balazsholczer.ui.commons.UniversMainUI;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;

@SpringView(name=UniversityLayoutFactory.NAME, ui=UniversMainUI.class )
public class UniversityLayoutFactory extends VerticalLayout implements View, UniversitySavedListener {

	public static final String NAME = "operations";
	
	private TabSheet tabSheet;
	
	@Autowired
	private AddUniversityLayoutFactory addUniversityLayoutFactory;
	
	@Autowired
	private ShowUniversitiesLayoutFactory showUniversitiesLayoutFactory;
	
	@Autowired
	private StatisticsUniversityLayoutFactory statisticsUniversityLayoutFactory;
	
	Component showAllUniversitiesTab;
	
	private void addLayout() {
		
		setMargin(true);
		
		tabSheet = new TabSheet();
		tabSheet.setWidth("100%");
		
		Component addUniversityTab = addUniversityLayoutFactory.createComponent(this);
		showAllUniversitiesTab = showUniversitiesLayoutFactory.createComponent();
		Component showStaticsTab = statisticsUniversityLayoutFactory.createComponent();
		
		tabSheet.addTab(addUniversityTab,"ADD UNIVERSITY");
		tabSheet.addTab(showAllUniversitiesTab,"SHOW ALL UNIVERSITIES");
		tabSheet.addTab(showStaticsTab,"STATISTICS");
		
		addComponent(tabSheet);
	}
	
	public void universitySaved() {
		showUniversitiesLayoutFactory.refreshTable();
		statisticsUniversityLayoutFactory.refresh();
	}
	
	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addLayout();
	}
}
