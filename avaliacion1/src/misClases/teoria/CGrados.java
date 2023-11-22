package misClases.teoria;

class CGrados {
	private float gradosC;

	public void CentrigadosAsignar(float gC){
		gradosC = gC;
	}
	float FahrenheitObtener() {
		return 9F/5F * gradosC + 32F;
	}
	float CentigradosObtener() {
		return gradosC;
	}
	

}

