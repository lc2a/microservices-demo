package io.globomart.microservices.products;

public class SearchCriteria {
	/*private String accountNumber;

	private String searchText;*/
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	/*public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
*/
/*	public boolean isValid() {
		if (StringUtils.hasText(accountNumber))
			return !(StringUtils.hasText(searchText));
		else
			return (StringUtils.hasText(searchText));
	}

	public boolean validate(Errors errors) {
		if (StringUtils.hasText(accountNumber)) {
			if (accountNumber.length() != 9)
				errors.rejectValue("accountNumber", "badFormat",
						"Account number should be 9 digits");
			else {
				try {
					Integer.parseInt(accountNumber);
				} catch (NumberFormatException e) {
					errors.rejectValue("accountNumber", "badFormat",
							"Account number should be 9 digits");
				}
			}

			if (StringUtils.hasText(searchText)) {
				errors.rejectValue("searchText", "nonEmpty",
						"Cannot specify account number and search text");
			}
		} else if (StringUtils.hasText(searchText)) {
			; // Nothing to do
		} else {
			errors.rejectValue("accountNumber", "nonEmpty",
					"Must specify either an account number or search text");

		}

		return errors.hasErrors();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (StringUtils.hasText(accountNumber) ? "number: " + accountNumber
				: "")
				+ (StringUtils.hasText(searchText) ? " text: " + searchText
						: "");
	}*/
}
