package org.example.domain;

public class LeaveRequestService {

    private LeaveRequestRepository repository;

    public LeaveRequest createLeaveRequest(LeaveRequestDTO dto) {
        return repository.save(new LeaveRequest());
    }
}