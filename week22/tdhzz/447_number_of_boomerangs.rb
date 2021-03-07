# @param {Integer[][]} points
# @return {Integer}
def number_of_boomerangs(points)
result = 0
    0.upto(points.size - 1) do |i|
        hash = Hash.new
        0.upto(points.size - 1) do |j|
            next if i.eql? j
            dist = (points[i][0] - points[j][0]) ** 2 +
                   (points[i][1] - points[j][1]) ** 2
            if hash.key? dist then
                result += hash[dist] * 2
                hash[dist] += 1
            else hash[dist] = 1
            end
        end
    end
    result
end
