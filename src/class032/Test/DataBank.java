package class032.Test;

public interface DataBank extends SqlDCL, SqlDML, SqlDDL{
	void openConection();
	void closeConection();

}
