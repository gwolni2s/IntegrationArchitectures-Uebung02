package org.example.IntegrationArchitecturesUebung02;

import org.example.IntegrationArchitecturesUebung02.evaluationRecords.EvaluationRecords;
import org.example.IntegrationArchitecturesUebung02.evaluationRecords.EvaluationRecordsController;
import org.example.IntegrationArchitecturesUebung02.evaluationRecords.EvaluationRecordsRepository;
import org.example.IntegrationArchitecturesUebung02.evaluationRecords.EvaluationRecordsService;
import org.example.IntegrationArchitecturesUebung02.salesman.Salesmen;
import org.example.IntegrationArchitecturesUebung02.helpClasses.textOutput;
import org.example.IntegrationArchitecturesUebung02.salesman.SalesmenController;
import org.example.IntegrationArchitecturesUebung02.salesman.SalesmenRepository;
import org.example.IntegrationArchitecturesUebung02.salesman.SalesmenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@SpringBootApplication
public class IntegrationArchitecturesUebung02Application {

	//Repository
	private static SalesmenRepository salesmenRepository;
	private static EvaluationRecordsRepository evaluationRecordsRepository;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(IntegrationArchitecturesUebung02Application.class, args);

		//runApp();
	}


	public static void runApp() throws Exception {

		//Services
		SalesmenService salesmenService = new SalesmenService(salesmenRepository);
		EvaluationRecordsService evaluationRecordsService = new EvaluationRecordsService(evaluationRecordsRepository);

		//Controller
		SalesmenController salesmenController = new SalesmenController(salesmenService);
		EvaluationRecordsController evaluationRecordsController = new EvaluationRecordsController(evaluationRecordsService);

		//declaration of variables
		boolean active = true;
		long sid;
		String firstname;
		String lastname;
		long year;
		String nameProduct;
		String client;
		String clientRanking;
		long soldItems;
		long targetValue;
		long leadershipCompetence;
		long opennessToEmployee;
		long socialBehaviour;
		long attitudeTowardsClient;
		long communicationSkills;
		long integrityToCompany;
		long bonusA;
		long bonusB;
		String remark;
		Salesmen salesman;
		EvaluationRecords record;

		//Create Scanner to take input from the command line
		Scanner scan = new Scanner(System.in);

		textOutput.welcome();

		while(active) {
			//Choose option from menu to execute
			textOutput.menu();
			switch (scan.nextInt()) {
				case 0:
					textOutput.thankYou();
					active = false;
					break;
				case 1:
					System.out.println("Please enter the sid of the new salesman");
					sid = scan.nextLong();
					System.out.println("Please enter the firstname of the new salesman");
					scan.nextLine();
					firstname = scan.nextLine();
					System.out.println("Please enter the lastname of the new salesman");
					lastname = scan.nextLine();
					salesmenController.registerNewSalesmen(new Salesmen(sid, firstname, lastname));
					break;
				case 2:
					System.out.println("Please enter <sid> of the new evaluation record");
					sid = scan.nextLong();
					System.out.println("Please enter <year> of the new evaluation record");
					year = scan.nextLong();
					System.out.println("Please enter <name of product> of the new evaluation record");
					scan.nextLine();
					nameProduct = scan.nextLine();
					System.out.println("Please enter <client> of the new evaluation record");
					client = scan.nextLine();
					System.out.println("Please enter <Client Ranking> of the new evaluation record");
					clientRanking = scan.nextLine();
					System.out.println("Please enter <Number of sold Items> of the new evaluation record");
					soldItems = scan.nextLong();
					System.out.println("Please enter <Target Value> of the new evaluation record");
					targetValue = scan.nextLong();
					System.out.println("Please enter <Leadership Competence> of the new evaluation record");
					leadershipCompetence = scan.nextLong();
					System.out.println("Please enter <Openness to Employee> of the new evaluation record");
					opennessToEmployee = scan.nextLong();
					System.out.println("Please enter <Social Behaviour to Employee> of the new evaluation record");
					socialBehaviour = scan.nextLong();
					System.out.println("Please enter <Attitude towards Client> of the new evaluation record");
					attitudeTowardsClient = scan.nextLong();
					System.out.println("Please enter <Communication Skills> of the new evaluation record");
					communicationSkills = scan.nextLong();
					System.out.println("Please enter <Integrity> to Company of the new evaluation record");
					integrityToCompany = scan.nextLong();
					System.out.println("Please enter <Bonus> Part A of the new evaluation record");
					bonusA = scan.nextLong();
					System.out.println("Please enter <Bonus> Part B of the new evaluation record");
					bonusB = scan.nextLong();
					System.out.println("Please enter <Remark> of the new evaluation record");
					scan.nextLine();
					remark = scan.nextLine();
					evaluationRecordsController.registerNewEvaluationRecord(new EvaluationRecords(sid, year, nameProduct, client, clientRanking, soldItems, targetValue, leadershipCompetence, opennessToEmployee, socialBehaviour, attitudeTowardsClient, communicationSkills, integrityToCompany, bonusA, bonusB, remark));
					break;
				case 3:
					System.out.println("Please enter the sid of the salesman.");
					salesman = salesmenController.getOneSalesmen(scan.nextLong());
					System.out.println(salesman.toString());
					break;
				case 4:
					System.out.println("Please enter the sid of the evaluation record");
					record = evaluationRecordsController.getOneEvaluationRecord(scan.nextLong());
					System.out.println(record.toString());
					break;
				case 5:
					System.out.println("Please enter the sid of the salesman you would like to delete");
					salesmenController.deleteSalesmen(scan.nextLong());  //manager.deleteSalesMan(scan.nextInt());
					break;
				case 6:
					System.out.println("PLease enter the sid of the evaluation record you would like to delete");
					evaluationRecordsController.deleteEvaluationRecord(scan.nextLong()); //manager.deleteEvaluationRecord(scan.nextInt());
					break;
				case 7:
					System.out.println("Please enter the sid of the new salesman");
					sid = scan.nextLong();
					System.out.println("Please enter the firstname of the new salesman");
					scan.nextLine();
					firstname = scan.nextLine();
					System.out.println("Please enter the lastname of the new salesman");
					lastname = scan.nextLine();
					salesmenController.updateSalesmen(sid, new Salesmen(sid, firstname, lastname)); //manager.updateSalesMan(new SalesMan(sid, firstname, lastname));
					break;
				case 8:
					System.out.println("Please enter <sid> of the new evaluation record");
					sid = scan.nextLong();
					System.out.println("Please enter <year> of the new evaluation record");
					year = scan.nextLong();
					System.out.println("Please enter <name of product> of the new evaluation record");
					scan.nextLine();
					nameProduct = scan.nextLine();
					System.out.println("Please enter <client> of the new evaluation record");
					client = scan.nextLine();
					System.out.println("Please enter <Client Ranking> of the new evaluation record");
					clientRanking = scan.nextLine();
					System.out.println("Please enter <Number of sold Items> of the new evaluation record");
					soldItems = scan.nextLong();
					System.out.println("Please enter <Target Value> of the new evaluation record");
					targetValue = scan.nextLong();
					System.out.println("Please enter <Leadership Competence> of the new evaluation record");
					leadershipCompetence = scan.nextLong();
					System.out.println("Please enter <Openness to Employee> of the new evaluation record");
					opennessToEmployee = scan.nextLong();
					System.out.println("Please enter <Social Behaviour to Employee> of the new evaluation record");
					socialBehaviour = scan.nextLong();
					System.out.println("Please enter <Attitude towards Client> of the new evaluation record");
					attitudeTowardsClient = scan.nextLong();
					System.out.println("Please enter <Communication Skills> of the new evaluation record");
					communicationSkills = scan.nextLong();
					System.out.println("Please enter <Integrity> to Company of the new evaluation record");
					integrityToCompany = scan.nextLong();
					System.out.println("Please enter <Bonus> Part A of the new evaluation record");
					bonusA = scan.nextLong();
					System.out.println("Please enter <Bonus> Part B of the new evaluation record");
					bonusB = scan.nextLong();
					System.out.println("Please enter <Remark> of the new evaluation record");
					scan.nextLine();
					remark = scan.nextLine();
					evaluationRecordsController.updateEvaluationRecord(sid, new EvaluationRecords(sid, year, nameProduct, client, clientRanking, soldItems, targetValue, leadershipCompetence, opennessToEmployee, socialBehaviour, attitudeTowardsClient, communicationSkills, integrityToCompany, bonusA, bonusB, remark));
					break;
				default:
					System.out.println("Input was not correct.\nPlease try again");
					break;
			}
		}
		scan.close();
	}
}

