package com.IHD.Project.data;

public class SearchDTO {


		private String query ;

		public String getQuery() {
			return query;
		}

		public void setQuery(String query) {
			this.query = query;
		}

		public SearchDTO(String query) {
			super();
			this.query = query;
		}
		
		public SearchDTO() {
		}
}
