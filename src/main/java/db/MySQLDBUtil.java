package db;

public class MySQLDBUtil {
	private static final String INSTANCE = "database-2.c9q3bqqb9fl8.ap-northeast-1.rds.amazonaws.com";
	private static final String PORT_NUM = "3306";
	public static final String DB_NAME = "laiproject1";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "jj79722356";
	public static final String URL = "jdbc:mysql://"
			+ INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";

}
