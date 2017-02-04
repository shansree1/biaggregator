package biaggregator;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String SQL_SEARCH_BY_PARAM = "SELECT * FROM BIAG_Artifact_Details detail "
				+ " LEFT JOIN BIAG_Artifact_Meta_Info meta"
				+ " ON detail.Artifact_ID = meta.Artifact_ID "
				+ " WHERE"
				+ " (upper(detail.Artifact_Long_Name) = :searchParam "
				+ " OR upper(detail.Artifact_Desc) = :searchParam"
				+ " OR upper(detail.Artifact_Owner_Dept) = :searchParam "
				+ " OR upper(meta.Artifact_Meta_Type) = :searchParam"
				+ " OR upper(meta.Artifact_Meta_Type = :searchParam)"
				+ " AND user.User_ID = :userId";
		System.out.println(SQL_SEARCH_BY_PARAM);

	}

}
