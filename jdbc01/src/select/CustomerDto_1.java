package select;

public class CustomerDto_1 {
	private int customerNo;
	private String customerId;
	private String customerPhone;
	private String customerTime;
	private String customerBuyTime;
	private int customerMileage;
	private String customerGrade;
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerTime() {
		return customerTime;
	}
	public void setCustomerTime(String customerTime) {
		this.customerTime = customerTime;
	}
	public String getCustomerBuyTime() {
		return customerBuyTime;
	}
	public void setCustomerBuyTime(String customerBuyTime) {
		this.customerBuyTime = customerBuyTime;
	}
	public int getCustomerMileage() {
		return customerMileage;
	}
	public void setCustomerMileage(int customerMileage) {
		this.customerMileage = customerMileage;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	@Override
	public String toString() {
		return "CustomerDto_1 [customerNo=" + customerNo + ", customerId=" + customerId + ", customerPhone="
				+ customerPhone + ", customerTime=" + customerTime + ", customerBuyTime=" + customerBuyTime
				+ ", customerMileage=" + customerMileage + ", customerGrade=" + customerGrade + "]";
	}
}