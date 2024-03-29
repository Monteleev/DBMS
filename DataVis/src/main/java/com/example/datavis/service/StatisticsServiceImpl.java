package com.example.datavis.service;

import com.example.datavis.dao.StatisticsRepository;
import com.example.datavis.entity.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StatisticsServiceImpl implements StatisticsService{
    @Autowired
    private StatisticsRepository statisticsRepository;

    public StatisticsServiceImpl() {
        super();
    }

    @Override
    public List<Statistics> findAll() {
        return statisticsRepository.findAll();
    }

    @Override
    public Statistics findById(int theId) {
        Statistics res = statisticsRepository.findById(theId);

        if (res != null ) {
            return res;
        }
        else {
            throw new RuntimeException("Did not find stat id - " + theId);
        }
    }

    @Override
    public List<Statistics> filterByCountry(List<Statistics> stats,List<String> code,List<String> indicator,int startYear,int endYear)
    {
        return stats.stream()
                .filter(stat -> code.contains(stat.getCode()) && indicator.contains(stat.getIndicator()) && startYear<= stat.getYear() && endYear >= stat.getYear())
                .collect(Collectors.toList());
    }
}
