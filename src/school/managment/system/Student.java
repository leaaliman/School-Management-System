package school.managment.system;


//questa classe serve a tenere tracci degli studenti: tasse, anno d'iscrizione(grade), id


public class Student {
	
	//uso private per proteggere l'informazione
	private int id;
	private String name;
	private int grade;
	private static int feesPaid;
	private int feesTotal;
	
	
	
	//costruttore per creare nuovi oggetti Student inizializzando i valori 	
	/*
	 * Tasse per ogni studente = 30,000� 
	 * Tasse pagate all'inizio = 0�
	 * @param id = unico per studente
	 * @param name = nome studente
	 * @param grade = anno d'iscrizione 
	 * 
	 */
	public Student(int id, String name, int grade) {
		//inizializzazione valori. con "this" mi rifersco al parametro creato nella classe Student e non quello dell'argomento del costruttore
		this.id = id;
		this.name = name;
		this.grade = grade;
		feesPaid = 0;//posso anche non usare this perch� non � parte dell'argomento e quindi non si crea confusione
			
	}

	//non cambieremo il nome dello studente. quindi il metodo set non serve.
	//lo stesso vale per id e name.
	
	
	/**
	 * Usato per ritornare il parametro grade
	 * @param grade = new grade of the student.
	 */
	//uso sempre void con il metodo set
	public void setGrade (int grade){
		this.grade =  grade;
		
	}
	
	
	/**
	 * Continuare ad aggiungere le tasse a feesPaid Feild (tassepagate = 10.000 + 5.000 + 15.000).
	 * Aggiungere le tasse pagate.
	 * La scuola riceve i fondi.
	 * 
	 * @param fees that the student pays
	 */
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
		
	}

	/**
	 * 
	 * @return student id
	 */
	public int getID(){
		return id;

	}

	/**
	 * 
	 * @return student name
	 */
	public String getName(){
		return name;

	}

	/**
	 * 
	 * @return student grade
	 */
	public int getGrade(){
		return grade;

	}

	/**
	 * 
	 * @return student payed fees
	 */
	public static int getFeesPaid(){
		return feesPaid;

	}

	/**
	 * 
	 * @return total fees
	 * 
	 */
	public int getFeesTotal(){
		return feesTotal;

	}
	
	/**
	 * 
	 * @return the remaining fees.
	 */
	public int getReamaingFees(){
		return feesTotal - feesPaid;

	}

	@Override
	public String toString (){
		return "Student's name: " +name+ " with id: "+id+ " has paied total fees: $" +feesPaid;
	}
	




	
	
	
	
	
	
	
	
}
