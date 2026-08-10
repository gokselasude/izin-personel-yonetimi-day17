package org.example.day4.exception;

import org.example.domain.LeaveRequest;
import java.util.ArrayList;
import java.util.List;

public class LeaveManager {
    private final List<LeaveRequest> leaveRequests = new ArrayList<>();

    public void addLeaveRequest(LeaveRequest request) {
        leaveRequests.add(request);
        System.out.println("İzin talebi eklendi. Durum: " + request.getStatus());
    }

    public List<LeaveRequest> getRequestsByStatus(String status) {
        List<LeaveRequest> filteredList = new ArrayList<>();
        for (LeaveRequest req : leaveRequests) {
            if (req.getStatus() != null && req.getStatus().equalsIgnoreCase(status)) {
                filteredList.add(req);
            }
        }
        return filteredList;
    }
}