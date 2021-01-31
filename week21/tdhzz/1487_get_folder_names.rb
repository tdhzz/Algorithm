# @param {String[]} names
# @return {String[]}
def get_folder_names(names)
    h = {}
    names.map do |n|
      if h[n]
        cnt = h[n]
        n_n = "#{n}(#{cnt})"
        while h[n_n] do
          cnt += 1
          n_n = "#{n}(#{cnt})"
        end
        h[n] = cnt + 1
        h[n_n] = 1
        n_n
      else
        h[n] = 1
        n
      end
    end
end
