# @param {Integer} r
# @param {Integer} c
# @param {Integer} r0
# @param {Integer} c0
# @return {Integer[][]}
def all_cells_dist_order(r, c, r0, c0)
    array = []
    (0...r).each do |row|
        (0...c).each do |cell|
            array.push([[row,cell], (row-r0).abs + (cell-c0).abs])
        end
    end
    array.sort_by(&:last).map(&:first)
end
