package org.example;

import org.example.domain.LeaveRequest;
import org.example.domain.LeaveRequestDTO;
import org.example.domain.LeaveRequestRepository;
import org.example.domain.LeaveRequestService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class LeaveRequestServiceTest {

    @Mock
    private LeaveRequestRepository leaveRequestRepository;

    @InjectMocks
    private LeaveRequestService leaveRequestService;

    @Test
    public void shouldCreateLeaveRequestSuccessfully() {
        // Arrange
        LeaveRequestDTO requestDTO = new LeaveRequestDTO();
        when(leaveRequestRepository.save(any())).thenReturn(new LeaveRequest());

        // Act
        LeaveRequest result = leaveRequestService.createLeaveRequest(requestDTO);

        // Assert
        assertNotNull(result, "Oluşturulan izin talebi null olmamalı!");
        verify(leaveRequestRepository, times(1)).save(any());
    }

    @Test
    public void shouldThrowExceptionWhenSaveFails() {
        // Arrange
        LeaveRequestDTO requestDTO = new LeaveRequestDTO();
        when(leaveRequestRepository.save(any())).thenThrow(new RuntimeException("Veritabanı bağlantı hatası!"));

        // Act & Assert
        assertThrows(RuntimeException.class, () -> {
            leaveRequestService.createLeaveRequest(requestDTO);
        });
    }
}