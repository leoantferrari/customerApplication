package ch.zli.m223.ksh17a.Leo_Ferrrrarrrri.customer_memos.service.memo;

import java.util.List;

import ch.zli.m223.ksh17a.Leo_Ferrrrarrrri.customer_memos.model.memo.MemoDto;

public interface MemoService {
	
	List<MemoDto> getCustomerMemos(Long customerId);

	MemoDto createMemo(MemoDto memoDto);

	void deleteMemo(Long id);
}