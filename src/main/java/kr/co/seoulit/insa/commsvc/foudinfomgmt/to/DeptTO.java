package kr.co.seoulit.insa.commsvc.foudinfomgmt.to;

import kr.co.seoulit.insa.commsvc.systemmgmt.to.BaseTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Transient;

@Data
@EqualsAndHashCode(callSuper=false)
public class DeptTO extends BaseTO {

	@Transient
	private String deptCode;
	@Transient
	private String deptName;
	@Transient
	private String deptTel;
	@Transient
	private String status;

}
