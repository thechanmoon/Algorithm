def judge_circle(moves)
    (moves.count("R") == moves.count("L")) && (moves.count("D") == moves.count("U"))
end

puts judge_circle("UD");